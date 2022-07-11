package com.va.common;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProjectResponse<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    public static ProjectResponse ok(Object data) {
        return ProjectResponse.builder().code(HttpStatusConstants.SUCCESS_CODE).message(HttpStatusConstants.SUCCESS_MESSAGE).data(data).build();
    }

    public static ProjectResponse error(Integer code, String message) {
        return ProjectResponse.builder().code(code).message(message).data(null).build();
    }

    public static ProjectResponse build(Integer code, String message, Object data) {
        return ProjectResponse.builder().code(code).message(message).data(data).build();
    }

}
