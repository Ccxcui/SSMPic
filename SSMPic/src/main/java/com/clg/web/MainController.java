package com.clg.web;

import org.apache.commons.io.FilenameUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.clg.entity.Picture;
import com.clg.entity.User;
import com.clg.service.PictureService;
import com.clg.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
public class MainController {
    @Autowired
    private PictureService pictureService;
    @Autowired
    private UserService userService;
    private boolean check = true;//防止因页面刷新而导致重复提交表单
    @RequestMapping(value = "/")//欢迎界面
    public String index(Model model){
        List<Picture> pictures =pictureService.getAllPicture();
        System.out.println(pictures.size());
        model.addAttribute("pictures",pictures);
        return "index";
    }
    @RequestMapping(value = "login")//登陆界面
    public String login(){
    	check = true;
        return "login";
    }
    @RequestMapping(value = "checkandRedict")//登录验证
    public String checkAndRedict(@Param("username") String username,@Param("password") String password,Model model){
        User user = userService.CheckUser(username,password);
        System.out.println(user);
        if (user!=null){
            return "upload";//上传文件界面
        }else {
        	List<Picture> pictures = pictureService.getAllPicture();
            model.addAttribute("pictures", pictures);
            return "index";//主界面
        }
    }
    
	@RequestMapping(value = "upload")//上传文件
    public String upload(@RequestParam("file") MultipartFile file,@Param("content") String content, HttpServletRequest request,Model model,Picture picture) throws IOException{
		if(check){
			//使用UUID给图片重命名，并去掉四个“-”
	    	String name = UUID.randomUUID().toString().replaceAll("-", "");
	    	//获取文件的扩展名
	    	String ext = FilenameUtils.getExtension(file.getOriginalFilename());
	    	//设置图片上传路径
	    	String url = request.getSession().getServletContext().getRealPath("/upload");
	    	System.out.println(url);
	    	//以绝对路径保存重名命后的图片
	    	file.transferTo(new File(url+"/"+name + "." + ext));
	    	//把图片存储路径保存到数据库
	    	picture.setPicname("upload/"+name + "." + ext);
	    	if(content == null){
	    		content = "";
	    	}
	    	picture.setContent(content);
	    	pictureService.InsertPicture(picture);
		}
    	check = false;
    	List<Picture> pictures = pictureService.getAllPicture();
        model.addAttribute("pictures", pictures);
        return "index";
    }
}
