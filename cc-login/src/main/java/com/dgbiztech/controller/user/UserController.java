package com.dgbiztech.controller.user;

import com.dgbiztech.dao.userlogin.UserLoginMapper;
import com.dgbiztech.model.userlogin.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserLoginMapper mapper;

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @GetMapping("/getUsers")
    public List<UserLogin> getUsers(){
        return mapper.getUsers();
    }

    @GetMapping("/getString")
    public String getStr(){
        return this.redisTemplate.opsForValue().get("keysssssss").toString()+"8802";
    }

    @GetMapping("/setString/{str}")
    public void setStr(@PathVariable("str") String str){
        this.redisTemplate.opsForValue().set("keysssssss", str);
    }

}
