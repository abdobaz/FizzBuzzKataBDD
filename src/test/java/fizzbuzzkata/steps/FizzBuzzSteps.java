package fizzbuzzkata.steps;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import fizzbuzzkata.FizzBuzz;
import junit.framework.Assert;

public class FizzBuzzSteps {
	
	private int firstNumber;
	private int secondNumber;
	private String outPut;
	private FizzBuzz fizzBuzz=new FizzBuzz();;
	
	@Given("^I have first number as (\\d+)$")
	public void I_have_first_number_as(int firstNumberArg) {
		firstNumber = firstNumberArg;
		Assert.assertTrue(firstNumber > 0 && firstNumber < 100);
	}

	@Given("^I have second number as (\\d+)$")
	public void I_have_second_number_as(int secondNumberArg) {
		secondNumber = secondNumberArg;
		Assert.assertTrue(secondNumber > 0 && secondNumber < 100);
	}

	@When("^I run fizzBuzz program$")
	public void I_run_fizzBuzz_program() {
		outPut = fizzBuzz.run(firstNumber, secondNumber);
	}

	@Then("^should show :$")
	public void should_show_(String expectedOutPut) {
		Assert.assertEquals(expectedOutPut, outPut.replaceAll("\\n|\\r\\n", System.getProperty("line.separator")));
	}
}
