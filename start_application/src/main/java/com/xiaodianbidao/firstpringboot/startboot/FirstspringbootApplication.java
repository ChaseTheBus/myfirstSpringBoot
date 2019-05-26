package com.xiaodianbidao.firstpringboot.startboot;

import com.xiaodianbidao.firstpringboot.filter.FirstFilter;
import com.xiaodianbidao.firstpringboot.filter.SecondFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(scanBasePackages ={"com.xiaodianbidao.firstpringboot"})
public class FirstspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstspringbootApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean firstFilter(){
        FilterRegistrationBean firstBean=new FilterRegistrationBean();
        firstBean.setFilter(new FirstFilter());
        firstBean.addUrlPatterns(FirstFilter.firstFilter);
        firstBean.setName("firstFilterName");
        firstBean.setOrder(1);
        System.out.println("this is in FilterRegistrationBean firstFilter ");
        return firstBean;
    }

    @Bean
    public FilterRegistrationBean secondFilter(){
        FilterRegistrationBean secondFilter=new FilterRegistrationBean();
        secondFilter.setFilter(new SecondFilter());
        secondFilter.addUrlPatterns(SecondFilter.SecondFilter);
        secondFilter.setName("second Filter Name");
        secondFilter.setOrder(2);
        System.out.println("this is in FilterRegistrationBean secondFilter");
        return secondFilter;
    }

}
