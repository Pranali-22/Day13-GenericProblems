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
		public static <E extends Comparable<E>> E maximumof3(E input1, E input2, E input3) {
			E max = input1;
			if(input2.compareTo(max) > 0) {
					max=input2;
			}
			if(input3.compareTo(max) > 0) {
				max=input3;
			}
			return max;
		}
					
		public static void main(String[] args) {
			//maximum for integer numbers
			Integer integerNum1 = 10, integerNum2=25, integerNum3=17;
			System.out.println("Maximum of Integer = "+maximumof3(integerNum1, integerNum2, integerNum3));
			
			//maximum for float numbers
			Float floatNum1 = (float) 1.1, floatNum2 = (float) 2.2, floatNum3 = (float) 3.3;
			System.out.println("Maximum of Float = "+maximumof3(floatNum1, floatNum2, floatNum3));
			
			//maximum for String
			String stringValue1 = "Pranali",stringValue2 = "Tani", stringValue3 = "Rutuja";
			System.out.println("Maximum of String = "+maximumof3(stringValue1, stringValue2, stringValue3));
			
		}

}
