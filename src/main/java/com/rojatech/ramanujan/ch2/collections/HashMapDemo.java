package com.rojatech.ramanujan.ch2.collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, String> phoneBook = new HashMap<>();
		
		phoneBook.put("Rajkumar", "9876543210");
		phoneBook.put("Marimuthu", "8765432109");
		phoneBook.put("Racshana", "8765432108");
		phoneBook.put("Risanth", "8765432107");
		phoneBook.put("Avanija", "8765432106");
		
		System.out.println(phoneBook);
		
		System.out.println(phoneBook.get("Avanija"));
		
		Set<String> keys = phoneBook.keySet();
		
		/*
		 * for (String str : keys) { System.out.println(phoneBook.get(str)); }
		 */
		
		keys.forEach(k->System.out.println(phoneBook.get(k)));
		
		Set<Map.Entry<String, String>> entries = phoneBook.entrySet();
		
		for (Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
 