package com.rojatech.ramanujan.ch09.designpatterns.observer;

public interface WeatherSubject {
	public void registerObserver(WeatherObserver observer);
	public void removeObserver(WeatherObserver observer);
	public void notifyObservers();
}
