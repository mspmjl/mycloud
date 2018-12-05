package com.mjl.mycloud.service;

import com.mjl.mycloud.dto.User;
import com.mjl.mycloud.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Miaojiale on 2018/12/4.
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public void insert(User user) {
        userMapper.insert(user);
    }

    public void update(User user) {
        userMapper.update(user);
    }

    public User selectByName(String name) {
        if (name == null) {
            return null;
        }
        return userMapper.selectByName(name);
    }
}
