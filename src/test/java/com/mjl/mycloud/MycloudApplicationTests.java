package com.mjl.mycloud;

import com.mjl.mycloud.dto.MPRReporting;
import com.mjl.mycloud.dto.User;
import com.mjl.mycloud.service.ReportingService;
import com.mjl.mycloud.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
@Component
public class MycloudApplicationTests {
    Logger logger = LoggerFactory.getLogger(MycloudApplicationTests.class);

    @Autowired
    UserService userService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    ReportingService reportingService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setUserName("tn");
        user.setPassword("tn");
        user.setRole("AM");
        user.setSection(1);
//        userService.insert(user);
    }

    @Test
    public void testUpdate() {
        User user = userService.selectByName("mjl");
        logger.info("====================" + user.toString());
        System.out.println(user.toString());
        user.setPassword("111222");
        user.setUpdateTime(new Date());
        userService.update(user);
    }

    @Test
    public void set() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("111", "222");
        System.out.println(valueOperations.get("111"));
    }

    @Test
    public void selectById() {
        MPRReporting mprReporting = reportingService.getById("A949EBEE-EB3F-4B86-9BCD-06E65ED1361D");
        if (mprReporting != null) {
            System.out.println(mprReporting.toString());
        }
//        List<MPRReporting> mprReportings = reportingService.selectByStatus();
//        if (mprReportings != null) {
//            System.out.println(mprReportings);
//            System.out.println(mprReportings.size());
//        }
    }
}
