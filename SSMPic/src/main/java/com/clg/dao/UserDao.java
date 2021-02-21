package com.clg.dao;

import org.apache.ibatis.annotations.Param;

import com.clg.entity.User;

public interface UserDao {
    /**如果查询到该用户就会返回1
     * @param username,password
     * @return数据库被修改的行数
     */
    User getUserByName(@Param("username") String username, @Param("password") String password);
}
