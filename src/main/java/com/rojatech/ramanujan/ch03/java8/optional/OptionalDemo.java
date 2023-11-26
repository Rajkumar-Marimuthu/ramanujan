package com.rojatech.ramanujan.ch03.java8.optional;
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
		System.out.println(emptyUser.isEmpty()); // true
		
		Optional<User> newUser = Optional.of(new User("Tom"));
		System.out.println(newUser.isPresent()); // true
		System.out.println(newUser.orElseThrow(() -> new NullPointerException("No Element"))); // User [name=Tom]
		
		User user = null;
		//Optional<User> newUser2 = Optional.of(user); // java.lang.NullPointerException
		Optional<User> newUser1 = Optional.ofNullable(user);
		System.out.println(newUser1.isPresent()); // false

		System.out.println(newUser1.orElse(new User("Maike"))); // User [name=Maike]
		System.out.println(newUser1.orElseGet(() -> new User("Maike"))); // User [name=Maike]
		//System.out.println(newUser1.orElseThrow(() -> new NullPointerException("No Element")));

		List<String> fruits = List.of("apple", "banana", "mango", "berry");
		Optional<String> matched = fruits.stream().filter(fruit -> fruit.startsWith("b")).findFirst();
		System.out.println(matched); // Optional[banana]
		System.out.println(matched.isEmpty()); // false
		System.out.println(matched.isPresent()); // true
		System.out.println(matched.get()); // banana
		matched.ifPresent(System.out::println); // banana
		
		Optional<String> matched1 = fruits.stream().filter(fruit -> fruit.startsWith("s")).findFirst();
		//System.out.println(matched1.get()); // java.util.NoSuchElementException
	}
}
