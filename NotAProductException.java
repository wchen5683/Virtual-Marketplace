package com.company;

public class NotAProductException extends Exception {
    public NotAProductException(String message) {
        super(message);
    }
}