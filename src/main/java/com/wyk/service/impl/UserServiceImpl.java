package com.wyk.service.impl;

import com.wyk.mapper.UserMapper;
import com.wyk.pojo.User;
import com.wyk.pojo.UserExample;
import com.wyk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User selectUserByUserId(Integer userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        return user;
    }

    @Override
    public User selectUserByUserAccount(String userAccount) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountEqualTo(userAccount);
        User user = userMapper.selectByExample(example).get(0);
        return user;
    }

    @Override
    public boolean checkUserAccountRepeated(String UserAccount) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountEqualTo(UserAccount);
        List<User> users = userMapper.selectByExample(example);
        if (users.size() != 0)
            return true;
        else
            return false;
    }

    @Override
    public int register(User user) {
        try {
            userMapper.insert(user);
        } catch (Exception e) {
            return 0;
        }
        return 1;
    }

    @Override
    public boolean checkUserPass(String userAccount, String password) {
        try {
            User user = selectUserByUserAccount(userAccount);
            if (user.getUserPassword().equals(password)) {
                return true;
            }

        } catch (Exception e) {
            System.out.println("找不到此用户");
        }

        return false;
    }

    @Override
    public boolean eidtUser(User user) {
        try {
            userMapper.updateByPrimaryKeySelective(user);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


}
