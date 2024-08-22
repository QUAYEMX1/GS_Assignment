package com.example.ToDoApplication.Exceptions;

public class ToDoNotFoundException extends RuntimeException{

    public ToDoNotFoundException(String msg){
        super(msg);
    }
}
