package com.rojatech.ramanujan.ch09.designpatterns.observer;

public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
