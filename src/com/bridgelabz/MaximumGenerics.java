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
	
	//Find maximum among n number of inputs
		public static <T extends Comparable<T>> T maximumof3(T... inputs) {
			T max = inputs[0];
			for(T input : inputs)
			if(input.compareTo(max) > 0) {
				max=input;
			}
			return max;
		}
		
		//Create generic method printMaximum to print maximum object
		public static<T> void printMaximum(T maxInput) {
			System.out.println("Maximum = "+maxInput);
		}
					
		public static void main(String[] args) {
			//maximum for integer numbers
			Integer integerNum1 = 10, integerNum2=25, integerNum3=17, integerNum4=60;
			Integer maxInt = maximumof3(integerNum1, integerNum2, integerNum3, integerNum4);
			printMaximum(maxInt);
			
			//maximum for float numbers
			Float floatNum1 = (float) 1.1, floatNum2 = (float) 2.2, floatNum3 = (float) 3.3;
			Float maxFloat = maximumof3(floatNum1, floatNum2, floatNum3);
			printMaximum(maxFloat);
			
			//maximum for String
			String stringValue1 = "Pranali", stringValue2 = "Rutuja";
			String maxString = maximumof3(stringValue1, stringValue2);
			printMaximum(maxString);
		}

}
