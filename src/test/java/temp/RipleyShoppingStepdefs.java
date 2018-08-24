package temp;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class RipleyShoppingStepdefs {

    WebDriver driver;

    @Given("^I am on the shopping website$")
    public void iAmOnTheShoppingWebsite() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://simple.ripley.cl/");
        driver.manage().window().maximize();
    }


    @When("^I search for the item$")
    public void iSearchForTheItem() throws Throwable {
        driver.findElement(By.cssSelector("input.js-search-bar")).sendKeys("secadora mademsa ventti 790");
        driver.findElement(By.cssSelector("input.js-search-bar")).sendKeys(Keys.RETURN);
    }

    @And("^I go to the item details page$")
    public void iGoToTheItemDetailsPage() throws Throwable {
        driver.findElement(By.cssSelector("div.catalog-container a.catalog-product[data-unique-id='2622026']")).click();
    }

    @And("^I add the item to the basket$")
    public void iAddTheItemToTheBasket() throws Throwable {
        driver.findElement(By.cssSelector("button[data-add-to-cart='2622027']")).click();
    }

    @Then("^I can view the item in my basket$")
    public void iCanViewTheItemInMyBasket() throws Throwable {
        assertTrue(driver.findElement(By.cssSelector("div.shopping-bag-item-image a[id='catalogEntry_img2622027']")).isDisplayed());
        driver.quit();
    }
}
