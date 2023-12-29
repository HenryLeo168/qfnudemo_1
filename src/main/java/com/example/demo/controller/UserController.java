package com.example.demo.controller;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private final UserDAO userDao;
    public UserController(UserDAO userDao){
        this.userDao = userDao;
        }

    @GetMapping("findById/{id}")
    public User findById(@PathVariable Integer id){
        Optional<User> userOptional = userDao.findById(id);

        return userOptional.orElse(null); ////  get or else
        }

    @PostMapping("add")
    public void add(User user){
        userDao.save(user);
    }
    @PostMapping("save")
    public String save(@RequestBody User user){
        userDao.save(user);
        return "success";
    }

    @PostMapping("removeById/{id}")
    public String removeById(@PathVariable Integer id){
        userDao.deleteById(id);
        return "success";
    }
}
