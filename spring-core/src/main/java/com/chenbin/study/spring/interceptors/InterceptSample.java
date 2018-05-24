package com.chenbin.study.spring.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InterceptSample {

  private static final Logger logger = LoggerFactory.getLogger(InterceptSample.class);

  public void intercept() {
    logger.info("Start interceptor sample test");
  }

}
