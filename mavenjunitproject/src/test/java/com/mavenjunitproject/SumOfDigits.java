package com.mavenjunitproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfDigits {

	public static int sum(int n) {
		int sum=0;
		int a=0;
		while(n!=0) {
			a=n%10;
			sum+=a;
			n=n/10;
			
			
		}
		return sum;
		
	}
	@Test
	public void SumDigit() {
		assertEquals(10,sum(64));
	}

}
