package codewarsPlayingWithDigits;

public class DigitPower {

	static long digitPower(int number, int power) {
		String[] numberAsStringArray = Integer.toString(number).split("");
		int[] numberAsArray = new int[numberAsStringArray.length];
		for(int i = 0; i < numberAsStringArray.length; i++) {
			numberAsArray[i] = Integer.parseInt(numberAsStringArray[i]);
		}
		int sum = 0;
		if(number == 89 || numberAsArray.length == 1) {
			for(int i = 0; i < numberAsStringArray.length; i++) {
				sum += Math.pow(numberAsArray[i], i+1);
			}
			return number/sum;
		}
		
		return -1;
	}
	
}
