package com.shweta.observer;

import java.util.List;

public interface Commentary {
   void setMessage(String message);
    List<Observer> getObservers();
   Message getMessage();
   void registerObservers(List<Observer>observers);
   void removeObservers(List<Observer>observers);
   void notifyObservers();


}