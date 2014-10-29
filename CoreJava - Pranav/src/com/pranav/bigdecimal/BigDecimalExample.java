package com.pranav.bigdecimal;

import java.io.IOException;
import java.math.BigDecimal;

public class BigDecimalExample {
	 
    public static void main(String args[]) throws IOException {
      
      //floating point calculation
      double amount1 = 2.15;
      double amount2 = 1.10;
      System.out.println("difference between 2.15 and 1.0 using double is: " + (amount1 - amount2));
    
      //Use BigDecimal for financial calculation
      // ALWAYS USE 'BigDecimal' WITH 'String'
      BigDecimal amount3 = new BigDecimal("2.15");
      BigDecimal amount4 = new BigDecimal("1.10");
      System.out.println("difference between 2.15 and 1.0 using BigDecimal is: " + (amount3.subtract(amount4)));      

      BigDecimal amount5 = new BigDecimal(2.15);
      BigDecimal amount6 = new BigDecimal(1.10);
      System.out.println("difference between 2.15 and 1.0 using BigDecimal is: " + (amount5.subtract(amount6)));      

    }     
}

//Read more: http://javarevisited.blogspot.com/2012/02/java-mistake-1-using-float-and-double.html#ixzz3DC87Zn6V
