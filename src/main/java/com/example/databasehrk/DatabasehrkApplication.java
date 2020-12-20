package com.example.databasehrk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DatabasehrkApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabasehrkApplication.class, args);
    }

}
