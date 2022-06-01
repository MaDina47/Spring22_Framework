package StepDefinition.Facebook;

import Pages.Facebook.LandingPage;
import Pages.Instagram.Instagram_Methods;
import Web.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSD {
    LandingPage lpage = new LandingPage();
    Instagram_Methods inPage = new Instagram_Methods();

    @Given("I am on facebook")
    public void launch() {
       lpage.launchFacebook();
    }

    @When("^I click on Facebook Pay, Oculus, Instagram, Portal and Bulletin$")
    public void openMultipleTabs() {
        lpage.clickMultipleWindows();
    }

    @Then("^I close 4 windows except Instagram$")
    public void closeWindows() {
        lpage.closeTabs();
    }
    @Then("^Verify number of window-Handles is 1$")
    public void numberOfWindowHandles(){
        Assert.assertEquals(inPage.numberOfHandles(),1, "test failed");
    }
    @Then("^Verify Page Title is Instagram$")
    public void verifyPageTitle(){
        Assert.assertEquals(inPage.pageTitle(),"Instagram","Test Failed");
    }
    @Then("^Verify Log in button on Instagram is disabled by default$")
    public void loginButtonDisabled(){
        Assert.assertFalse(inPage.instagramLogInBtnIsDisabled(),"is enabled");
    }


}
