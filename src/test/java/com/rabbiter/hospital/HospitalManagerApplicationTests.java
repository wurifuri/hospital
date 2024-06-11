package com.rabbiter.hospital;

import com.rabbiter.hospital.pojo.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HospitalManagerApplicationTests {
    @Autowired
   private UserMapper userMapper;

    @Test
    public void testGet(){
        Admin admin = userMapper.get(1);
        System.out.println(admin);
    }

}
