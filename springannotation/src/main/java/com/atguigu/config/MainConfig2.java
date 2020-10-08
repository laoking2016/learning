package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfig2 {

    @Bean("person")
    @Scope("prototype")
    public Person person(){
        return new Person("张三", 25);
    }
}
