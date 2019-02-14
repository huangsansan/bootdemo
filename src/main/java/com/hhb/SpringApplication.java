package com.hhb;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/*换成通用mapper，包扫描更改成tk包下的*/
@SpringBootApplication
@MapperScan("com.hhb.dao")
public class SpringApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(SpringApplication.class, args);
    }
}
