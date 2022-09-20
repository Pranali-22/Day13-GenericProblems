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
	public static void maximumof3(Integer num1, Integer num2, Integer num3) {
		Integer max = num1;
		if(num2.compareTo(max) > 0) {
			max=num2;
		}
		
		if(num3.compareTo(max) > 0) {
			max=num3;
		}
		
		System.out.println("Maximum = "+max);
	}
	public static void main(String[] args) {
		Integer num1=10, num2=25, num3=16;
		MaximumGenerics.maximumof3(num1,num2,num3);
	}

}
