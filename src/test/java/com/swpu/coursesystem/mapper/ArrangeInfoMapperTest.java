package com.swpu.coursesystem.mapper;

import com.swpu.coursesystem.entity.ArrangeInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class ArrangeInfoMapperTest {
    @Autowired
    private ArrangeInfoMapper arrangeInfoMapper;
    @Autowired
    private ArrangeDetailMapper arrangeDetailMapper;
    @Test
    public void addArrangeInfo() {
        ArrangeInfo arrangeInfo = new ArrangeInfo();
        arrangeInfo.setArrangeId("6");
        arrangeInfo.setTeacherId("123");
        arrangeInfo.setTeachClassId("123");
        arrangeInfo.setPracticeContent("Java");
        arrangeInfo.setPracticeCourseNum(30);
        int re = arrangeInfoMapper.addArrangeInfo(arrangeInfo);
        log.info("re:"+re);
    }

    @Test
    public void deleteArrangeInfo() {
//        int re1 = arrangeDetailMapper.deleteArrangeDetailByArrangeId("2");
//        int re2 = arrangeInfoMapper.deleteArrangeInfo("2");
        int re1 = arrangeDetailMapper.deleteArrangeDetailByTeacherId("123");
        int re2 = arrangeInfoMapper.deleteArrangeInfoByTeacherId("123");
        log.info("result: re1:"+re1+" re2:"+re2);
//        log.info("re:"+re);
    }

    @Test
    public void getAllArrangeInfo() {
    }

    @Test
    public void getArrangeByTeacherId() {
    }

    @Test
    public void getArrangeInfoByClassId() {
    }

    @Test
    public void getArrangeInfo() {
    }

    @Test
    public void updateArrangeInfo() {
    }
}