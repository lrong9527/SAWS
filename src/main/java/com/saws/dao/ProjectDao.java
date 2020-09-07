package com.saws.dao;

import com.saws.entity.Project;
import com.saws.entity.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectDao {
    ProjectMapper projectMapper;
    @Autowired
    void setProjectMapper(ProjectMapper projectMapper){this.projectMapper = projectMapper;}

    public boolean newProject(Project project){
        return projectMapper.insertProject(project) == 1;
    }

    public List<Project> findAll(){
        return projectMapper.findAll();
    }
}
