package com.mavenjunitproject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class AddTest {

static int add(int a,int b) {
return a+b;
}
static int sub(int c,int d) {
return c-d;
}
static int mul(int a,int b) {
return a*b;
}
static int div(int a,int b) {
return a/b;
}
String s1="hello";
String s2="hello";
@Test
public void stringMatch() {
	assertSame(s2, s1);
}
@Test
public void testAdd() {

	
assertEquals(4, add(2,2));
} 
@Test
public void testSub() {

	
assertEquals(0, sub(2,2));
} 
@Test
public void testMul() {

	
assertEquals(22, mul(2,3));
} 
}
