package cn.edu.csu.colorworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloController")
    public String helloController(){
        return "hello controller";
    }

//    @GetMapping("/hello/{name}")
//    public  String helloSb_1(@PathVariable("name") String realname){
//        return "hello " + realname;
//    }

    @GetMapping("/hi")
    public  String helloSb_2(@RequestParam(value = "name", defaultValue = "admin") String realname){
        return "hi " + realname;
    }

}
