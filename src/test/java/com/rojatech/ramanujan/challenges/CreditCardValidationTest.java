package com.rojatech.ramanujan.challenges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CreditCardValidationTest {

	@Test
	void test() {
		assertTrue(!CreditCardNumberValidation.validateCreditCardNumber("4624748233249080"));
		assertTrue(CreditCardNumberValidation.validateCreditCardNumber("4624748233249780"));
	}

}
