package com.rojatech.ramanujan.ch9.others;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class RegExDemo {

	public static boolean isEmailValid(String email) {
		String emailRegExp = "^[a-zA-Z0-9_+&*-]+.@[a-zA-Z0-9_+&*-.]+$";
		
		Pattern pat = Pattern.compile(emailRegExp);
		if (email == null) 
			return false;
		return pat.matcher(email).matches();
	}
	
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[abc]", "d")); // false
		System.out.println(Pattern.matches("[^abc]", "d")); // true
		System.out.println(Pattern.matches("[a-z&&[def]]", "d")); // true
		System.out.println(Pattern.matches("[0-9]+$", "2011"));
	
		String str = "+a-+b";
		System.out.println(str.replaceAll("\\+", "\\#"));
		System.out.println(str.replace("\\+", "\\#"));
		
		// email validation
		List<String> mailAddresses = new ArrayList<String>();
		mailAddresses.add("review-team@gmail.com");
		mailAddresses.add("review.team@gmail.com");
		mailAddresses.add("test@gmail.com");
		mailAddresses.add("abcd_+&*-@com");
		
		mailAddresses.forEach(email -> {
			if (isEmailValid(email)) {
				System.out.println(email + " - valid");
			} else {
				System.out.println(email + " - not valid");
			}
		});
		

	}

}
