package com.company.page;

import com.company.interfaces.Observable;
import com.company.interfaces.Observer;

import java.util.HashSet;
import java.util.Set;

public class PageState implements Observable {
    Set<Observer> observerSet = new HashSet<>();
    String state;

    public PageState(String state){
        this.state = state;
    }

    @Override
    public void attach(Observer observer) {
        observerSet.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerSet.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observerSet.forEach(Observer::update);
    }

    public void setPageState(String state){
        this.state = state;
        notifyObserver();
    }

    public String getState(){
        return this.state;
    }
}
