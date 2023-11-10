package com.rojatech.ramanujan.ch9.enumeration;

public class PaymentTest {

	public static void main(String[] args) {
		PaymentTypes[] values = PaymentTypes.values();
		for (PaymentTypes paymentTypes : values) {
			System.out.println(paymentTypes);
			System.out.println(paymentTypes.ordinal());
			System.out.println(paymentTypes.getFee());
		}
	}

}
