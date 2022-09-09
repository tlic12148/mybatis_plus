package com.tlic.mybatis_plus;

import com.tlic.mybatis_plus.entity.User;
import com.tlic.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CRUDTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert(){

        User user = new User();
        user.setName("Tlic");
        user.setAge(18);
        user.setEmail("123@qq.com");

        //返回值：影响的行数
        int result = userMapper.insert(user);
        System.out.println("影响的行数" + result);
        System.out.println("user id: " + user.getId());
    }
}
