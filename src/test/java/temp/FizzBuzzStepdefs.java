package temp;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import temp.FizzBuzz;

public class FizzBuzzStepdefs {
    FizzBuzz fizzBuzz;
    String result ;

    @Given("^Create a Fizz Buzz Game play$")
    public void createAFizzBuzzGamePlay() throws Throwable {
        fizzBuzz = new FizzBuzz();
    }

    @When("^I play with number (\\d+)$")
    public void iPlayWithNumber(int num) throws Throwable {
        result = fizzBuzz.play(num);
    }

    @Then("^The result is \"([^\"]*)\"$")
    public void theResultIs(String expected) throws Throwable {
        Assert.assertEquals(result, expected);
    }
}
