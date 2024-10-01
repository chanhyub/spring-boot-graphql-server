package com.example.springbootgraphqlserver.common;

public class InternalErrorException extends RuntimeException {

    public InternalErrorException(String message) {
        super(message);
    }
}
