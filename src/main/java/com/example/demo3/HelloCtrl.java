package com.example.demo3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//这是一个控制器
public class HelloCtrl
{
    @RequestMapping("/")//将地址映射到 / 即访问http://localhost:8080 就可以进入这个方法
    @ResponseBody//返回数据,如果不添加该注解将在resources/templates下寻找与之对应的html模版
    public String hello()
    {
        return "hello springdddd88988 boot";
    }
}