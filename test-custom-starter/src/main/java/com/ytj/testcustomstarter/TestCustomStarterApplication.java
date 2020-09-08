package com.ytj.testcustomstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestCustomStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestCustomStarterApplication.class, args);
        com.ytj.mystarter.business.ExampService service;
    }

}
