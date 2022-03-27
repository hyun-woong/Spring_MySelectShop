package com.sparta.spring2_week01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // @WebServlet 어노테이션이 동작하게 함
@SpringBootApplication
public class Spring2Week01Application {
    public static void main(String[] args) {
        SpringApplication.run(Spring2Week01Application.class, args);
    }
}
