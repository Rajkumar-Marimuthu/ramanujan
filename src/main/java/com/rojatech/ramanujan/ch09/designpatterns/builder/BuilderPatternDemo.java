package com.rojatech.ramanujan.ch09.designpatterns.builder;


public class BuilderPatternDemo {

	public static void main(String[] args) {
		PersonBuilder builder = new PersonBuilderImpl();
		Person person = builder.setName("Raj").setAge(37).setAddress("London").build();
		System.out.println(person.toString());
		
		PersonDirector director = new PersonDirector(builder);
		Person person1 = director.construct();
		System.out.println(person1.toString());
	}

}
