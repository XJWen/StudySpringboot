package com.study.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource(value = {"classpath:config/author.properties"},ignoreResourceNotFound = true,encoding = "UTF-8")
public class ProConfig {

    /** PropertySourcesPlaceholderConfigurer这个bean，
    这个bean主要用于解决@value中使用的${…}占位符。
    假如你不使用${…}占位符的话，可以不使用这个bean。**/
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
