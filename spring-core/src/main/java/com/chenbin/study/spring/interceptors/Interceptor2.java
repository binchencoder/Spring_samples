package com.chenbin.study.spring.interceptors;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by chenbin on 18-5-24.
 */
public class Interceptor2 implements MethodInterceptor {

  private static final Logger logger = LoggerFactory.getLogger(Interceptor2.class);

  @Override
  public Object invoke(MethodInvocation invocation) throws Throwable {
    logger.warn("Before: invocation:{}", invocation);
    Object rval = invocation.proceed();
    logger.warn("Invoke interceptor2 returned");

    return rval;
  }
}
