package com.test;

import com.config.SpringConfig;
import com.controller.UserController;
import com.service.UserService;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app {
    @Test
    public void test(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(ctx.getBean(UserService.class));
//        System.out.println(ctx.getBean(UserController.class));
    }

}
