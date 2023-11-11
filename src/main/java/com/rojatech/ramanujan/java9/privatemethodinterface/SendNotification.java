package com.rojatech.ramanujan.java9.privatemethodinterface;

public interface SendNotification {

	static void sendNotifications() {
		establishConnection();
		System.out.println("Sending multiple notification");
	}
	
	default void sendNotification() {
		establishConnection();
		System.out.println("Sending notification");
	}
	
	private static void establishConnection() {
		System.out.println("Estalishing a connection");
	}
}
