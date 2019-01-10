package cn.edu.csu.colorworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController   //RestController = Controller + ResponseBody
public class HelloWorld {

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello Spring-Boot";
    }
}
