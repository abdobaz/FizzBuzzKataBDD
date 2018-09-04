package fizzbuzzkata.steps;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;

public class FizzBuzzSteps {
	@Given("^I have first number as (\\d+)$")
	public void I_have_first_number_as(int arg1) {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^I have second number as (\\d+)$")
	public void I_have_second_number_as(int arg1) {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^I run fizzBuzz program$")
	public void I_run_fizzBuzz_program() {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^should show :$")
	public void should_show_(String arg1) {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
}
