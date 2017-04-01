package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import implementation.Checkout;
import org.junit.Assert;

/**
 * Created by maritvandijk on 4/1/17.
 */
public class CheckoutStepDefs {

    Checkout checkout;
    int itemPrice;

    @Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
    public void thePriceOfItem(String item, int price) throws Throwable {
        itemPrice = price;
    }

    @When("^I checkout (\\d+) \"([^\"]*)\"$")
    public void checkoutNumberOfItems(int number, String item) throws Throwable {
        checkout = new Checkout();
        checkout.add(number, itemPrice);
    }

    @Then("^the total price should be (\\d+)c$")
    public void verifyTotalPrice(int total) throws Throwable {
        Assert.assertEquals(total, checkout.total);
    }

}
