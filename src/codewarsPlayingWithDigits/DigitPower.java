/*
 * This is a solution to the codewars problem:
 * https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java
 * Solved using TDD processes. Consult Readme for full details.
 * 
 * @author  Jamie Wong
 * @version 13.0.0
 * @since	08/04/2020
 */

package codewarsPlayingWithDigits;

public class DigitPower {

	static long digitPower(int number, int power) {
		String[] numberAsStringArray = Integer.toString(number).split("");
		int[] numberAsArray = new int[numberAsStringArray.length];
		for(int i = 0; i < numberAsStringArray.length; i++) {
			numberAsArray[i] = Integer.parseInt(numberAsStringArray[i]);
		}
		long sum = 0;
		int indexTracker = 0;
		for(int i = power; i < numberAsStringArray.length + power; i++) {
			sum = sum + (long) Math.pow(numberAsArray[indexTracker], i);
			indexTracker++;
		}
		if(sum % number == 0) {
			return sum/number;
		}
		return -1;
	}
	
}
