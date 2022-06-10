package StepDefinition.Hotels;

import Helper.Misc;
import Pages.Hotels.LandingPage;
import Pages.Hotels.SignIn;
import Web.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SignInSD {

    LandingPage lpage = new LandingPage();
    SignIn spage = new SignIn();

//    TC 21

    @Given("^I launch Hotels.com$")
    public void launchHotelsWebPage(){
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com");
        MyDriver.getDriver().manage().window().maximize();

    }
    @When("^I click on “Sign in” button$")
    public void clickSignIn(){
        lpage.signInClick();
        Misc.pause(5);
    }
    @When("^I click Sign in link in opened menu bar$")
    public void clickSignInMenuBar(){
        lpage.signInMenuBarClick();
    }

    @When ("^I enter invalid email address (.+)$")
    public void invalidEmail(String input){
        spage.invalidEmail(input);
    }

    @When ("^I enter invalid password (.+)$")
    public void invalidPassword(String input){
        spage.invalidPassword(input);
    }

    @When ("^I click on Sign in button$")
    public void SignInBt(){
        spage.clickSignInButton();
        Misc.pause(4);
    }

    @Then("^I verify error message is displayed$")
    public void isErrorDisplayed(){
        Assert.assertTrue(spage.isErrorDisplayed());
        MyDriver.quitWindows();

    }












}
