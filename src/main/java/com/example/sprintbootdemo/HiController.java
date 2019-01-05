package com.example.sprintbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController     //等同于同时加上了@Controller和@ResponseBody
public class HiController {

    //访问/hello或者/hi任何一个地址，都会返回一样的结果
    @RequestMapping(value = {"/kevin","/kev"},method = RequestMethod.GET)
    public String say(){
        return "hi you!!!";
    }
}