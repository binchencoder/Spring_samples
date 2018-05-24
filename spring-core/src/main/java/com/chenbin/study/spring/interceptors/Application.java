package com.chenbin.study.spring.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:root-context.xml"})
public class Application {

  private static final Logger logger = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    InterceptSample sample = new InterceptSample();
    sample.intercept();

    SpringApplication.run(Application.class, args);
  }
}
