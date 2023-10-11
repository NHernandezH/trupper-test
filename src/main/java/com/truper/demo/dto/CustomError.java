package com.truper.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomError {

    private String message;
    private Integer code;
}
