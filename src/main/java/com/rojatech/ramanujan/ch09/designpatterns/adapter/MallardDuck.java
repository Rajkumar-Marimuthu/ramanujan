package com.rojatech.ramanujan.ch09.designpatterns.adapter;

public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("quack...");
	}

	@Override
	public void fly() {
		System.out.println("fly...");
	}

}
