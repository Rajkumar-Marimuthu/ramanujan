package com.rojatech.ramanujan.ch9.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	public String value1();
	public String value2();
}
