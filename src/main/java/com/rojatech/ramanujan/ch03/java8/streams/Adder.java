package com.rojatech.ramanujan.ch03.java8.streams;
import java.util.function.Consumer;
import java.util.function.Function;

public interface Adder {
	String add (Function<String, String> f);
	void add (Consumer<Integer> f);
}