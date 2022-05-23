package StepDefinition.Darksky;

import Web.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSD {
    @Given("I am on Darksky")
    public void launchDarksky(){
        MyDriver.launchUrlOnNewWindow("https://www.darksky.net/");
    }
    @When("I get title of darksky")
    public void getTitle(){
        System.out.println(MyDriver.getDriver().getTitle());
    }

    @Then("I quit darksky")
    public void quitDarksky(){
        MyDriver.quitWindows();
    }

}
