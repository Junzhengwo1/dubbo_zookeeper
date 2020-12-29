package com.kou;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dell
 */
@EnableDubbo
@SpringBootApplication
public class SpringbootProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProviderApplication.class, args);
    }

}
