package com.huawei.genex.common.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class CommonExceptionHandler {
    @ExceptionHandler
    protected String exceptionHandle(Exception e){
        log.info(e.getMessage(),e);
        return e.getMessage();
    }
}
