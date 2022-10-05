package com.controller;

import com.exception.BusinessException;
import com.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e){
        return new Result(e.getCode(),null,e.getMessage());
    }

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e){
        return new Result(e.getCode(),null,e.getMessage());
    }


    @ExceptionHandler(Exception.class)
    public Result doException(Exception e){
        System.out.println("异常往哪跑？！");
        return new Result(666,null,"系统繁忙，请练习管理员");
    }
}
