package com.clg.service;


import com.clg.entity.User;

public interface UserService {
    /**本次中我们只需要对用户身份做出判断然后给予url
     * @return 数据库查询到为1
     */
    User CheckUser(String username, String password);
}
