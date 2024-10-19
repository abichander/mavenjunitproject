package com.mavenjunitproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseNum {
	public static int rev1(int rev) {
		int no = 64, rev1=64,r,a; 
		a=no;
	


	while(no>0) 
	{ 
	} 
	r = no%10; 
	rev1 = rev1*10+r; 
	return no=no/10; 
	
}
	@Test
	public void Reverse() {
		assertEquals(46,rev1(64));
	}
}