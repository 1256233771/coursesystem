package com.swpu.coursesystem.mapper;

import com.swpu.coursesystem.entity.ArrangeDetail;
import com.swpu.coursesystem.util.MyUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class ArrangeDetailMapperTest {

    @Autowired
    private ArrangeDetailMapper arrangeDetailMapper;

    @Test
    public void addDetail(){
        ArrangeDetail detail = new ArrangeDetail();
        detail.setDetailId(MyUtil.getDetailKey());
        detail.setArrangeId("6");
        detail.setWeek(5);
        detail.setDay(2);
        detail.setLabRoomId(402);
        detail.setStartTime(7);
        detail.setEndTime(9);
        int re = arrangeDetailMapper.addArrangeDetail(detail);
        log.info("re:"+re);
    }

    @Test
    public void getArrangeDetailByArrangeId() {
        List<ArrangeDetail> arrangeDetails =  arrangeDetailMapper.getArrangeDetailByArrangeId("1");
        log.info("arrangeDetails:"+arrangeDetails.toString());
    }
}