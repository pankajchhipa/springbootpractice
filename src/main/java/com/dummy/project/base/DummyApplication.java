package com.dummy.project.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.dummy.project.base.dao")
public class DummyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DummyApplication.class, args);
    }

}
