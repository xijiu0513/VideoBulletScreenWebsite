package com.wyk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@MapperScan("com.wyk.mapper")
@SpringBootApplication
public class VideodanmakusiteApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(VideodanmakusiteApplication.class);
        //return super.configure(builder);
    }

    public static void main(String[] args) {
        SpringApplication.run(VideodanmakusiteApplication.class, args);
    }

}
