package com.shweta.observer;

public class ConcreteObserver2 implements Observer {


    @Override
    public void update(Message message) {
        System.out.println("ConcreteObserver2 received message: " + message.getMessage());
    }
}
