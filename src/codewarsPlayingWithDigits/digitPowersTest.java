package codewarsPlayingWithDigits;

import static org.junit.Assert.*;

import org.junit.Test;

public class digitPowersTest {

	@Test
	public void digitPower_11_1_returnCorrectAnswer() {
		assertEquals(-1, DigitPower.digitPower(11, 1));
	}
	
	@Test
	public void digitPower_89_1_returnCorrectAnswer() {
		assertEquals(1, DigitPower.digitPower(89, 1));
	}


}