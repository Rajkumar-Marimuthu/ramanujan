package com.rojatech.ramanujan.ch09.designpatterns.decorator;

public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+", Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.15;
	}

}
