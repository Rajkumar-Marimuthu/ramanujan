package com.rojatech.ramanujan.ch09.others;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

class IPAddressVerification{

	@Test
	public void verifyIPtest() {
		
		assertEquals(true, verifyIP("172.19.20.10"));
		assertEquals(false, verifyIP("172.19,20.10"));
		assertEquals(false, verifyIP("172.19,20"));
		assertEquals(true, verifyIP("1.1.1.1"));
		
	}
	
	public boolean verifyIP(String ipaddr) {
		return ipaddr.matches(new MyRegex().pattern);
	}
	
    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            String IP = in.next();
//            System.out.println(IP.matches(new MyRegex().pattern));
//        }

    	String ipAddr = "0.0.0.0";
    	String addrField = "\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5]";
    	String addrExp = addrField+"\\."+addrField+"\\."+addrField+"\\."+addrField;
    	boolean result = ipAddr.matches(addrExp);
    	//boolean result = addrField.matches("1");
    	//boolean result = ipAddr.matches(addrField+"\\."+addrField+"\\."+addrField+"\\."+addrField);
    	System.out.println(result);
    }
    

}

//Write your code here
class MyRegex {
    String pattern = "[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}";
    
}



