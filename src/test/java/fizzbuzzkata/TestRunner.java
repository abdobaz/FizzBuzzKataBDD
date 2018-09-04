package fizzbuzzkata;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;
import cucumber.junit.Cucumber.Options;

@RunWith(Cucumber.class)
@Options(features="features/fizzBuzz.feature",format = {"pretty", "html:target/cucumber"})
public class TestRunner {

}
