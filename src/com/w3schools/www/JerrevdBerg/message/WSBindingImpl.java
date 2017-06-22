/**
 * WSBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.w3schools.www.JerrevdBerg.message;

public class WSBindingImpl implements com.w3schools.www.JerrevdBerg.message.WSInterface{
    public float getAverage(com.w3schools.www.JerrevdBerg.Values request) throws java.rmi.RemoteException, com.w3schools.www.JerrevdBerg.ErrorMessage {
    	if(request.getValue1() < 0 || request.getValue2() < 0){
    		throw new com.w3schools.www.JerrevdBerg.ErrorMessage((Float.toString(request.getValue1()) + Float.toString(request.getValue2())), "Please make sure you enter positive numbers");
    	}
    	
    	else if(request.getValue1() == 0 && request.getValue2() == 0){
    		throw new com.w3schools.www.JerrevdBerg.ErrorMessage((Float.toString(request.getValue1()) + Float.toString(request.getValue2())), "Please do not enter two values of 0");
    	}
    	else{
    	float f = (request.getValue1() + request.getValue2()) / 2;
        return f;
    	}


    }

}
