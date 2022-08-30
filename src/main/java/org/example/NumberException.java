package org.example;

public class NumberException extends Exception{

    public NumberException(String message){
        super(message);//try to use this custom exception
    }
}
