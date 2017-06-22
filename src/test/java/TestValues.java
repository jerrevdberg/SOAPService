package test.java;


import com.w3schools.www.JerrevdBerg.Values;

import junit.framework.*;

public class TestValues extends TestCase {
	public void testSetValue1(){
		Values v1 = new Values(1.0f, 50.0f);
		v1.setValue1(20.0f);
		
		assertEquals(v1.getValue1(), 20.0f);
	}
	
	public void testSetValue2(){
		Values v2 = new Values(1.0f, 50.0f);
		v2.setValue1(40.0f);
		
		assertEquals(v2.getValue1(), 40.0f);
	}
	
	public void testGetValue1(){
		Values v1 = new Values(1.0f, 50.0f);
		assertEquals(v1.getValue1(), 1.0f);
	}
	
	public void testGetValue2(){
		Values v2 = new Values(1.0f, 300.0f);
		assertEquals(v2.getValue2(), 300.0f);
		
	}
	

} 
