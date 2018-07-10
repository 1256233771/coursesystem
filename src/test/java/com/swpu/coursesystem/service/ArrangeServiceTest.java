package com.swpu.coursesystem.service;

import com.swpu.coursesystem.entity.ArrangeDetail;
import com.swpu.coursesystem.entity.ArrangeInfo;
import com.swpu.coursesystem.util.MyUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class ArrangeServiceTest {
    @Autowired
    private ArrangeService arrangeService;

    @Test
    public void existDetailId() {

    }

    @Test
    public void existArrangeId() {

    }

    @Test
    public void addDetail() {
        ArrangeDetail detail = new ArrangeDetail();
        detail.setDetailId(MyUtil.getDetailKey());
        detail.setArrangeId("3");
        detail.setWeek(10);
        detail.setDay(5);
        detail.setLabRoomId(402);
        detail.setStartTime(1);
        detail.setEndTime(2);
        Assert.assertEquals(arrangeService.addDetail(detail),true);
    }

    @Test
    public void addArrangeInfo() {
        ArrangeInfo info = new ArrangeInfo();
        info.setArrangeId(MyUtil.getArrangeKey());
        info.setTeachClassId("123");
        info.setPracticeContent("javascript");
        info.setTeacherId("123456");
        info.setPracticeCourseNum(40);
        Assert.assertEquals(arrangeService.addArrangeInfo(info),true);
    }

    @Test
    public void deleteDetail() {
        Assert.assertEquals(arrangeService.deleteDetail("807060322563"),true);
    }

    @Test
    public void deleteInfo() {
        Assert.assertEquals(arrangeService.deleteInfo("8280181888"),true);
    }

    @Test
    public void deleteInfoByClassId() {
    }

    @Test
    public void findArrangeDetail() {
        ArrangeDetail detail = arrangeService.findArrangeDetail("468441658467");
        log.info("detail:"+detail.toString());
    }

    @Test
    public void findArrangeInfo() {
    }

    @Test
    public void updateDetail() {
    }

    @Test
    public void updateInfo() {
    }

    @Test
    public void findArrangeInfoByDetailId() {
    }

    @Test
    public void findArrangeDetailsByArrangeId() {
    }

    @Test
    public void findArrangeInfosByTeacherId() {
    }

    @Test
    public void findArrangeInfosByClassId() {
    }

    @Test
    public void findAllArranges() {
    }

    @Test
    public void deleteAllArrangeInfoByTeacher() {
    }

    @Test
    public void deleteDetail1() {
    }

    @Test
    public void deleteArrange() {
    }
}