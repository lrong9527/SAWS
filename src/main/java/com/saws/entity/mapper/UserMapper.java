package com.saws.entity.mapper;

import com.saws.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user where user_id = #{user_id} ")
    public User getUser_ByID(String id);

    @Insert(" insert into user(user_id,user_password,user_name,user_phone,user_address,user_age,user_gender)" +
            "values (#{user_id},#{user_password},#{user_name},#{user_phone},#{user_address},#{user_age},#{user_gender}) ")
    public int addUser(User usr);

    @Select(" select * from user")
    public List<User>  List();

    @Select("select user_password from user where user_id = #{user_id}")
    String getPassword(String id);
}

