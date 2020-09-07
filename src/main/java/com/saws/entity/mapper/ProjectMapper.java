package com.saws.entity.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import com.saws.entity.Project;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProjectMapper {
    @Insert("insert into project values (#{proName}, #{introduce}, #{department},  #{managerName},  #{managerId}, #{managerPhone}, #{peopleNumber}， #{proMoney}， #{startTime}， #{endTime}， #{proState})")
    int insertProject(Project project);

    @Select("SELECT * FROM project")
    List<Project> findAll();
}
