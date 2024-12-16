package br.com.java_angular.spring_angular.Exception;

public class ResourceNotFoundException  extends RuntimeException{
    
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
