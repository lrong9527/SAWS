package com.saws.entity.mapper;

import com.saws.entity.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AdminMapper {
    @Select("select * from admin")
    List<Admin> findAll();

    @Select("select ad_password from admin where ad_id = #{admin_id}")
    String getPasswordById(String admin_id);

    @Insert("insert into admin values(#{ad_id}, #{ad_password}. #{ad_name}, #{ad_phone}, #{ad_flag})")
    int insertAdmin(Admin admin);
}
