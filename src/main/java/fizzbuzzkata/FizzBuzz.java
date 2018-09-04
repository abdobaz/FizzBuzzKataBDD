package fizzbuzzkata;

public class FizzBuzz {

	private final static String STRING_EMPTY = "";
	private final static String NEW_LINE = "\n";
	private final static String FIZZ = "Fizz";
	private final static String BUZZ = "Buzz";
	private final static String FIZZ_BUZZ = "FizzBuzz";

	public String run(int firstNumber, int secondNumber) {
		String result = STRING_EMPTY;
		for (int number = firstNumber; number <= secondNumber; number++) {
			if ((number % 15 ==0)) {
				result += FIZZ_BUZZ;
			}
			else if (number % 3 == 0) {
				result += FIZZ;
			}else if (number % 5 == 0) {
				result += BUZZ;
			} else {
				result += String.valueOf(number);
			}
			if (number != secondNumber) {
				result += NEW_LINE;
			}
		}
		return result;
	}

}
