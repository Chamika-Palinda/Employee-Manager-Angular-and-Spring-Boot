package com.chamika.Employee.Manager.Angular.and.Spring.Boot.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {
        super(message);
    }
}
