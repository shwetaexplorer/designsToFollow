package com.shweta.observer;

public class ConcreteMessage implements Message {
    private String message;

    public ConcreteMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
