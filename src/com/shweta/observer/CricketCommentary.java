package com.shweta.observer;

import java.util.ArrayList;
import java.util.List;

public class CricketCommentary implements Commentary{
    private Message cricketMessage;

    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public List<Observer> getObservers() {
        return observers;
    }

    public CricketCommentary(List<Observer> observers) {
        this.observers = observers;
       // registerObservers(this.observers);
    }

    @Override
    public void setMessage(String message) {
        this.cricketMessage = new ConcreteMessage(message);
    }

    @Override
    public Message getMessage() {
        return this.cricketMessage;
    }

    @Override
    public void registerObservers(List<Observer> observers) {
        this.observers.addAll(observers);
    }

    @Override
    public void removeObservers(List<Observer> observers) {
        this.observers.removeAll(observers);
    }

    @Override
    public void notifyObservers() {
    for(Observer observer : observers) {
        observer.update(cricketMessage);

    }
    }
}
