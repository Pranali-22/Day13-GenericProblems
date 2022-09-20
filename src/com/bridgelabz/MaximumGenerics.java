/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class MaximumGenerics {

	/**
	 * @param args
	 */
	
	//Find maximum among 3 integers
	public static void maximumof3Integer(Integer num1, Integer num2, Integer num3) {
		Integer max = num1;
		if(num2.compareTo(max) > 0) {
			max=num2;
		}
		
		if(num3.compareTo(max) > 0) {
			max=num3;
		}
		
		System.out.println("Maximum of integer = "+max);
	}
	
	//Find maximum among 3 float
	public static void maximumof3Float(Float num1, Float num2, Float num3) {
		Float max = num1;
		if(num2.compareTo(max) > 0) {
			max=num2;
		}
		
		if(num3.compareTo(max) > 0) {
			max=num3;
		}
		
		System.out.println("Maximum of float = "+max);
	}
	
	public static void main(String[] args) {
		//maximum for integer numbers
		Integer integerNum1=10, integerNum2=25, integerNum3=16;
		MaximumGenerics.maximumof3Integer(integerNum1,integerNum1,integerNum1);
		
		//maximum for float numbers
		Float floatNum1 = (float) 1.1 , floatNum2 = (float) 2.2, floatNum3 = (float) 3.3; 
		MaximumGenerics.maximumof3Float(floatNum1, floatNum2, floatNum3);
		
	}

}
