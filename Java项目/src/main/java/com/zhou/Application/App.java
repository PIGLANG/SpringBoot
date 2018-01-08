package com.zhou.Application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by zhoumeineng on 2018/1/2.
 */
@ComponentScan(value = {"com.zhou.Controler"})
@MapperScan("com.zhou.Mapper")
@EnableAutoConfiguration
public class App {
    public static void main(String[] arc){
        SpringApplication.run(App.class,arc);
    }
}
