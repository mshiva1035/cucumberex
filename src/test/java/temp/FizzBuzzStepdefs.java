package temp;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import temp.FizzBuzz;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

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
