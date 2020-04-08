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

import static org.junit.Assert.*;

import org.junit.Test;

public class digitPowersTest {

	@Test
	public void digitPower_11_1_returnNegativeOne() {
		assertEquals(-1, DigitPower.digitPower(11, 1));
		assertEquals(-1, DigitPower.digitPower(92, 1));
	}

	@Test
	public void digitPower_powerFrom1_returnOne() {
		assertEquals(1, DigitPower.digitPower(1, 1));
		assertEquals(1, DigitPower.digitPower(9, 1));
		assertEquals(1, DigitPower.digitPower(89, 1));
	}
	
	@Test
	public void digitPower_powerFrom2_returnTwo() {
		assertEquals(2, DigitPower.digitPower(695, 2));	
	}
	
	@Test
	public void digitPower_powerFrom3_return51() {
		assertEquals(51, DigitPower.digitPower(46288, 3));	
	}
}