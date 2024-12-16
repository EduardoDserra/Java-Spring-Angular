package br.com.java_angular.spring_angular.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorDTO {

    private String message;
    private String details;
    private int statusCode;

    
    public ErrorDTO(String message, String details, int statusCode) {
        this.message = message;
        this.details = details;
        this.statusCode = statusCode;
    }

    
}
