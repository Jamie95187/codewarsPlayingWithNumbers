package codewarsPlayingWithDigits;

import static org.junit.Assert.*;

import org.junit.Test;

public class digitPowersTest {

	@Test
	public void digitPower_11_1_returnNegativeOne() {
		assertEquals(-1, DigitPower.digitPower(11, 1));
	}
	
	@Test
	public void digitPower_89_1_returnOne() {
		assertEquals(1, DigitPower.digitPower(89, 1));
	}

	@Test
	public void digitPower_powerFrom1_returnOne() {
		assertEquals(1, DigitPower.digitPower(1, 1));
		assertEquals(1, DigitPower.digitPower(9, 1));
	}
}