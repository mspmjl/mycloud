package com.mjl.mycloud;

import com.mjl.mycloud.dto.User;
import com.mjl.mycloud.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MycloudApplicationTests {
    @Autowired
    UserService userService;

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
        user.setPassword("111222");
        user.setUpdateTime(new Date());
        userService.update(user);
    }
}