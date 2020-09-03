package com.saws.dao;

import com.saws.entity.User;
import com.saws.entity.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserDao")
public class UserDao {
    @Autowired
    UserMapper userMapper;
    public boolean register(User user){

        if(userMapper.getUser_ByID(user.getUser_id()) == null){
            return userMapper.addUser(user) == 1;
        }
        return false;
    }

    public boolean authenticate(String id, String pw){
        return userMapper.getPassword(id).equals(pw);
    }
}
