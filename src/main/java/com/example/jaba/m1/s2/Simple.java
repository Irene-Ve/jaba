/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m1.s2;

// java.lang is implicitly imported!
// import java.lang.System;

/**
 * A Java "Hello world"  
 * this is a javadoc comment!!
 * this comment will be extract and used for documentation
 * @author Emanuele Galli
 */
public class Simple {
    /**
     * Just to say hello
     * 
     * @param args when passed, the first argument is printed
     */
    public static void main(String[] args) {
        // output a string to console
        System.out.print("Hello ");
    	//String name = args[0];
    	
        // output is based on input arguments
        if (args.length == 1) {
            System.out.println(args[0]);
        } else if (args.length == 2){
        	  System.out.println(args[0] + " & " + args[1]);
        } else {
        	System.out.println("...stranger");
        }
        
        // example execution from Terminal 
        //C:\Users\IEVO\git\jaba\src\main\java\com\example\jaba\m1>java s2/Simple.java "Silvia Maria" Giovanni
        
    }
}
