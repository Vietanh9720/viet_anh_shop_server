package com.va.common;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
public class BusinessException extends RuntimeException{
    private Integer code;
    private String message;

    public BusinessException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

