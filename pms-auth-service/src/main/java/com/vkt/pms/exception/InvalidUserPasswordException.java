package com.vkt.pms.exception;

public class InvalidUserPasswordException extends  RuntimeException{
    public InvalidUserPasswordException(String message){super(message);}
}
