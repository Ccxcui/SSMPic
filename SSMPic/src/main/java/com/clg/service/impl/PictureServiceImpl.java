package com.clg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clg.dao.PictureDao;
import com.clg.entity.Picture;
import com.clg.service.PictureService;

import java.util.List;

@Service
public class PictureServiceImpl implements PictureService {
    @Autowired
    private PictureDao pictureDao;

    public List<Picture> getAllPicture() {
        return pictureDao.getAllPictures();
    }
    public void InsertPicture(Picture picture){
    	 pictureDao.InsertPicture(picture);
    }
}
