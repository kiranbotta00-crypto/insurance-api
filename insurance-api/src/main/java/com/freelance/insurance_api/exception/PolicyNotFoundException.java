package com.freelance.insurance_api.exception;

public class PolicyNotFoundException extends RuntimeException{

    public PolicyNotFoundException(String message){
        super(message);
    }
}
