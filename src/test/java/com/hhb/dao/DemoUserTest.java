package com.hhb.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoUserTest {
    @Autowired
    private DemoUser demoUser;

    @Test
    public  void testQuery(){
        com.hhb.pojo.DemoUser user = this.demoUser.selectByPrimaryKey(1);
        System.out.println(user.getName());
    }

}
