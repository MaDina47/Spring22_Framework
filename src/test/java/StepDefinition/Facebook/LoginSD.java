package StepDefinition.Facebook;

import Web.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSD {

    @Given("I am on facebook")
    public void launch() {
        MyDriver.launchUrlOnNewWindow("https://www.facebook.com/");
    }

    @When("I get title")
    public void title() {
        System.out.println(MyDriver.getDriver().getTitle());
    }

    @Then("I quit")
    public void quit() {
        MyDriver.quitWindows();
    }

}
