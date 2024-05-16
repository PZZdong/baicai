package com.baicai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.baicai.dao"})
public class BaicaiApplication {  

  public static void main(String[] args) {
    SpringApplication.run(BaicaiApplication.class, args);
  }
}
