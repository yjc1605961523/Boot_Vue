package com.ty;

import javafx.application.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan( {"com.ty.dao"})
public class BootVueMain {
    public static void main(String[] args) {
        SpringApplication.run(BootVueMain.class,args);
    }
}
