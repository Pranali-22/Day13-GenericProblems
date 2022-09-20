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
	public static void maximumof3(Integer[] integerNumberArray) {
		Integer max = integerNumberArray[0];
		for(Integer e : integerNumberArray) {
			if(e.compareTo(max) > 0) {
				max=e;
			}
		}
		
		System.out.println("Maximum Integer = "+max);
	}
	public static void main(String[] args) {
		//maximum for integer numbers
		Integer[] integerNumber= {10,25,17};
		MaximumGenerics.maximumof3(integerNumber);
	}

}
