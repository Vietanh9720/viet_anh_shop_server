package com.va.common;

import org.springframework.validation.Errors;

public class ValidationException {
    public static void VALIDATE(Errors e) {
        if (e.hasErrors()) {
            throw new BusinessException(HttpStatusConstants.INVALID_FIELD_CODE, e.getFieldError() != null ? e.getFieldError().getDefaultMessage() : HttpStatusConstants.INVALID_FIELD_MESSAGE);

        }
    }
}
