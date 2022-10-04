package com.controller;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(String name,int age){
        System.out.println("普通参数传递 name==>"+name);
        System.out.println("普通参数传递 age==>"+age);
        return "{'module':'user save'}";
    }

    @RequestMapping("/paramDifferentName")
    @ResponseBody
    public String paramDifferentName(@RequestParam("Username")String name,@RequestParam("ages")Integer age){
        System.out.println("普通参数传递 name==>"+name);
        System.out.println("普通参数传递 age==>"+age);
        return "{'module':'user save'}";
    }

    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user){
        System.out.println("pojo参数传递===>"+user);
        return "{'module':'user save'}";
    }


    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes){
        System.out.println("数组参数传递 likes==>"+ Arrays.toString(likes));
        return "{'module':'user delete'}";
    }

    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes){
        System.out.println("集合参数传递 likes==>"+ likes);
        return "{'module':'user delete'}";
    }

    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println("list common(Json)参数传递 list==>"+likes);
        return "azhe";
    }

    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user){
        System.out.println("pojo参数传递===>"+user);
        return "{'module':'user save'}";
    }

    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo(){
        System.out.println("返回json对象数据");
        User user=new User();
        user.setName("张三");
        user.setAge(15);
        return user;
    }
}
