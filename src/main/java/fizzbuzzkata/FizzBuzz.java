package fizzbuzzkata;

public class FizzBuzz {

	public String run(int firstNumber, int secondNumber) {
		String result="";
		for (int i = firstNumber; i <= secondNumber; i++) {
			if(i%3==0) {
				result+="Fizz";
			}else if(i%5==0) {
				result+="Buzz";
			}else {
				result+=String.valueOf(i);
			}
			if(i!=secondNumber) {
				result+="\n";
			}
		}
		return result;
	}

}
