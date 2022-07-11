package com.va.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
@Slf4j
public class HandleException {
    @ExceptionHandler(BusinessException.class)
    public ProjectResponse<?> handleBusinessException(BusinessException ex) {
        return ProjectResponse.error(ex.getCode(), ex.getMessage());
    }
}