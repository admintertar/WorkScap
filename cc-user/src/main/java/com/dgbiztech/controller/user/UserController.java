package com.dgbiztech.controller.user;

import com.dgbiztech.dao.userlogin.UserLoginMapper;
import com.dgbiztech.model.userlogin.UserLogin;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        return this.redisTemplate.opsForValue().get("keysssssss");
    }

    @GetMapping("/setString/{str}")
    public void setStr(@PathVariable("str") String str){
        this.redisTemplate.opsForValue().set("keysssssss", str);
    }

    @PostMapping("/getPost")
    public Map<String,String> getPostStr(){
        Map<String,String> map = new HashMap<>();

        map.put("1","a");
        map.put("2","b");

        return map;
    }

}
