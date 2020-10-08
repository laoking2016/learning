package com.atguigu.config;

import com.atguigu.bean.Person;
import com.atguigu.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


@Configuration
//@ComponentScan(value = "com.atguigu")
/*@ComponentScan(value = "com.atguigu", excludeFilters = {
        @Filter(type = FilterType.ANNOTATION, classes = {
                Controller.class,
                Service.class
        })
})*/
@ComponentScan(value = "com.atguigu", includeFilters = {
        @Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
        @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BookService.class}),
        @Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
}, useDefaultFilters = false)
public class MainConfig {

    @Bean
    public Person person(){
        return new Person("lisi", 20);
    }
}
