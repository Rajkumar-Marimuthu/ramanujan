package com.rojatech.ramanujan.ch09.designpatterns.observer;

public interface WeatherObserver {
	public void update(int temperature, int windSpeed, int pressure);
}
