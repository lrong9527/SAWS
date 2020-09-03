package com.saws.dao;

import com.saws.entity.Admin;
import com.saws.entity.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminDao {
    AdminMapper adminMapper;
    @Autowired
    void setAdminMapper(AdminMapper adminMapper){this.adminMapper = adminMapper;}

    List<Admin> findAll(){
        return adminMapper.findAll();
    }

    public boolean authenticate(String id, String password){
        return password.equals(adminMapper.getPasswordById(id));
    }
}
