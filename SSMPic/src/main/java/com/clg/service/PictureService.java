package com.clg.service;

import com.clg.entity.Picture;

import java.util.List;

public interface PictureService {
    /**查询所有图片
     * @return 所有图片
     */
    List<Picture> getAllPicture();

    /**上传图片
     * @param multipartFile
     * @return
     */
    void InsertPicture(Picture picture);

}
