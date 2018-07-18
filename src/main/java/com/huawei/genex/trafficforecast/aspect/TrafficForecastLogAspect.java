//package com.huawei.genex.trafficforecast.aspect;
//
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//@Slf4j
//public class TrafficForecastLogAspect  {
//
//    @Pointcut("execution(public * com.huawei.genex.trafficforecast..*.*(..))")
////@Pointcut("@target(org.springframework.stereotype.Controller) && @target(org.springframework.web.bind.annotation.RestController)")
//protected void logPointcut() {}
//
//
//    @Before("logPointcut()")
//    protected void doBefore(JoinPoint joinPoint){
//        System.out.println("omggggggggggggg");
//        log.info("className:{}",joinPoint.getSignature().getDeclaringType());
//        log.info("methodName:{}",joinPoint.getSignature().getDeclaringTypeName());
//    }
//
//    @AfterReturning(returning = "object", value = "logPointcut()")
//    protected void doAfterReturning(Object object){
//        log.info("result:{}",object);
//    }
//}
