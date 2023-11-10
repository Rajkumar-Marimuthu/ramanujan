package com.rojatech.ramanujan.ch3.java8.optional;
import java.util.List;
import java.util.Optional;

class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
}

public class OptionalDemo {

	public static void main(String[] args) {
		
		Optional<User> emptyUser = Optional.empty();
		System.out.println(emptyUser.isEmpty());
		
		Optional<User> newUser = Optional.of(new User("Tom"));
		System.out.println(newUser.isPresent());
		System.out.println(newUser.orElseThrow(() -> new NullPointerException("No Element")));
		
		User user = null;
		Optional<User> newUser1 = Optional.ofNullable(user);
		System.out.println(newUser1.isPresent());

		System.out.println(newUser1.orElse(new User("Maike")));
		System.out.println(newUser1.orElseGet(() -> new User("Maike")));
		//System.out.println(newUser1.orElseThrow(() -> new NullPointerException("No Element")));

		//Optional<User> newUser2 = Optional.of(user); // java.lang.NullPointerException
		//System.out.println(newUser2.isPresent());

		List<String> fruits = List.of("apple", "banana", "mango");
		Optional<String> matched = fruits.stream().filter(fruit -> fruit.startsWith("b")).findFirst();
		System.out.println(matched);
		System.out.println(matched.isEmpty());
		System.out.println(matched.isPresent());
		System.out.println(matched.get());
		matched.ifPresent(System.out::println);
		
		Optional<String> matched1 = fruits.stream().filter(fruit -> fruit.startsWith("s")).findFirst();
		//System.out.println(matched1.get()); // java.util.NoSuchElementException
	}
}
