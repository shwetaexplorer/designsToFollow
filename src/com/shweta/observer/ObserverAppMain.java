package com.shweta.observer;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

public class ObserverAppMain {


    public static void main(String[] args) {

        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        Observer observer3 = new ConcreteObserver1();
        Observer observer4 = new ConcreteObserver2();
        List<Observer> observers = new ArrayList<Observer>();
        observers.add(observer1);
        observers.add(observer2);
        observers.add(observer3);
        observers.add(observer4);
        Message message = new ConcreteMessage("Welcome to broadcast for IPL");

        Commentary commentary = new CricketCommentary(observers);
        commentary.setMessage(message.getMessage());
        commentary.notifyObservers();




    }
}
