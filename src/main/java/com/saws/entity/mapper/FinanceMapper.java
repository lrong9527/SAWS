package com.saws.entity.mapper;


import com.saws.entity.Finance;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FinanceMapper {
    @Select("select * from finance")
    List<Finance> findAll();



    @Insert("insert into finance(dep_name,type,price,dep_no) values(#{dep_name}, #{type}. #{price},#{dep_no})")
    int insertFinance(Finance finance);
}
