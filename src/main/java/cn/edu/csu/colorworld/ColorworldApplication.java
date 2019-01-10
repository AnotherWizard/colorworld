package cn.edu.csu.colorworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ColorworldApplication {

    @RequestMapping("/")
    String home() {
        return "<b>Hello World!";
    }
    public static void main(String[] args) {
        SpringApplication.run(ColorworldApplication.class, args);
    }

}

