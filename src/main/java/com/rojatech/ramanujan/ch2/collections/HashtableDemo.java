package com.rojatech.ramanujan.ch2.collections;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashtableDemo {

	public static void main(String[] args) {
		Map<String, String> phoneBook = new Hashtable<>();
		
		phoneBook.put("Rajkumar", "9876543210");
		phoneBook.put("Marimuthu", "8765432109");
		phoneBook.put("Racshana", "8765432108");
		phoneBook.put("Risanth", "8765432107");
		phoneBook.put("Avanija", "8765432106");
		
		System.out.println(phoneBook);
		
		System.out.println(phoneBook.get("Avanija"));
		
		Set<String> keys = phoneBook.keySet();
		
		keys.forEach(k->System.out.println(phoneBook.get(k)));
		
		Set<Map.Entry<String, String>> values = phoneBook.entrySet();
		
		for (Map.Entry<String, String> entry : values) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}