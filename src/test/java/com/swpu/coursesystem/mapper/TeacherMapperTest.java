package com.swpu.coursesystem.mapper;

import com.swpu.coursesystem.entity.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class TeacherMapperTest {

    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private UserDetailsService userDetailsService;
    @Test
    public void getTeacher() {
        Teacher teacher = teacherMapper.getTeacher("123456789");
        log.info("teacher:"+teacher.toString());
    }
    @Test
    public void addTeacher(){
        int re = teacherMapper.addTeacher(new Teacher("1234","testTeacher","123","user"));
        log.info("add result = "+re);
    }
    @Test
    public void deleteTeacher(){
        int re = teacherMapper.deleteTeacher("1234");
        log.info("add result = "+re);
    }
    @Test
    public void updateTeacher(){
        int re = teacherMapper.updateTeacher(new Teacher("123456","柴林枫","123456","user"));
        log.info("add result = "+re);
    }
}