package com.shweta.observer;

public class ConcreteObserver1 implements Observer {


    @Override
    public void update(Message message) {
        System.out.println("ConcreteObserver1 received message: " + message.getMessage());
    }
}
