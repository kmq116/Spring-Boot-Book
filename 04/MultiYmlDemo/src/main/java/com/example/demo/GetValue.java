package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GetValue {
    //获取配置文件中的age
    @Value("${myenvironment.name}") // 赋值初始值
    private String myenvironment;
    @GetMapping("/getValue")
    private String getMyenvironment() {
        return myenvironment;
    }

    @Value("${server.port}")
    private int port;
    @GetMapping("/getPort")
    private int getPort(){
        return port;
    }


}
