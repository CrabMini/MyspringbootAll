package com.spring.swagger.controller;


import com.spring.swagger.Bean.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "比丢，比丢";
    }
    @RequestMapping("/getUser")
    public User getUser(){
        return new User();
    }

    @ApiOperation("Crab的接口")
    @PostMapping("/crab")
    @ResponseBody
    public String crab(@ApiParam("这个名字会被返回")String username){
        return username;
    }

}