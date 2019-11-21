package com.itheima.springboot_springdatajpa.test;

import com.itheima.springboot_springdatajpa.DemoApplication;
import com.itheima.springboot_springdatajpa.domain.User;
import com.itheima.springboot_springdatajpa.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class JPATest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test(){
        List<User> users = userRepository.findAll();
        long n = userRepository.count();

        System.out.println(users);
        System.out.println("==========="+n);
    }
}
