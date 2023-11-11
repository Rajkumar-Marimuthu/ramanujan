package com.rojatech.ramanujan.java9.privatemethodinterface;

public class SendNotificationImpl implements SendNotification {

	public static void main(String[] args) {
		SendNotification sn = new SendNotificationImpl();
		sn.sendNotification();
		SendNotification.sendNotifications();
	}
}
