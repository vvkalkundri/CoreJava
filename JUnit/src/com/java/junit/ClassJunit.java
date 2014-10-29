package com.java.junit;

public class ClassJunit {
	private String message;
     public ClassJunit(String message){
    	 this.message = message;
     }
     
     public String PrintMessage(){
    	 System.out.println(message);
    	 return message;
     }
}
