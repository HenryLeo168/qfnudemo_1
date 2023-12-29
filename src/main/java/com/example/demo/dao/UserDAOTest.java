package com.example.demo.dao;

import com.example.demo.entity.User;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Optional;

@SpringBootTest
public class UserDAOTest {
    @Resource
    private UserDAO userRepository;

    @Test
    public void saveUser(){
        User user = new User();
        user.setId(1);
        user.setUsername("admin");
        user.setName("张三");
        user.setPassword("123456");
        user.setAge(20);
        user.setPhone("12345678901");

        userRepository.save(user);
    }

    @Test
    public void findUser(){
        Optional<User> userOptional = userRepository.findById(1);

        if(userOptional.isPresent()){
            System.out.println(userOptional.get().getName());
        }else {
            System.err.println("未查询到相关对象！");
        }
    }
}




