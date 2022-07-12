package com.wyk.service;

import com.wyk.pojo.User;


public interface UserService {


    //通过User_id查询
    User selectUserByUserId(Integer userId);

    //通过账号搜索
    User selectUserByUserAccount(String userAccount);

    //查询账号是否被人使用  存在 True
    boolean checkUserAccountRepeated(String UserAccount);

    //注册初始账号
    int register(User user);

    //查看账号密码是否对应
    boolean checkUserPass(String userAccount, String password);

    //更新账号信息
    boolean eidtUser(User user);

}
