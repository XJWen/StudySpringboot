package com.study.springboot;

import com.study.springboot.config.ProConfig;
import com.study.springboot.properties.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootApplication {
    @RequestMapping("/")
    public String index(){
        ProConfig.propertySourcesPlaceholderConfigurer();
        return "Hello springboot";
    }

    @Value("${book.author}")
    private String author;
    @Value("${book.name}")
    private String name;
    @RequestMapping("/book")
    public String book(){
        return "book author is:"+author+" and book name is:"+name;
    }

    @Autowired
    private AuthorSettings settings;
    @RequestMapping("/author")
    public String author(){
        return "author name is:"+settings.getName()+" author age is:"+settings.getAge();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
