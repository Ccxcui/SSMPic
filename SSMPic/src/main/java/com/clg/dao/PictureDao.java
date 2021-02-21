package com.clg.dao;

import com.clg.entity.Picture;

import java.util.List;

public interface PictureDao {
    /**
     * @return 返回所有图片
     */
    List<Picture> getAllPictures();

    /**上传图片，并且将图片地址及图片标签信息插入数据库
     */
    void InsertPicture(Picture picture);

}
