package org.resys.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author why
 */
@ComponentScan(value = {"org.resys"})
@MapperScan(value = {"org.resys.dao"})
@SpringBootApplication
public class REwebApplication {
    public static void main(String[] args) {
        SpringApplication.run(REwebApplication.class, args);
    }

}

