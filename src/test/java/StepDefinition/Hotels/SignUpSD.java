package StepDefinition.Hotels;

import Pages.Hotels.SignIn;
import Pages.Hotels.SignUP;
import Web.MyDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import javax.sound.midi.Soundbank;

public class SignUpSD {
    SignUP supage = new SignUP();
    SignIn sipage = new SignIn();

    @When("^I click Sign up link in opened menu bar$")
    public void SignUpClick() {
        sipage.clickSignUpButton();
    }

    @When("^I click “Terms and Conditions” link$")
    public void TermsAndConditionsClick() {
        supage.clickTermsAndConditions();

    }
     @Then("^I verify “Terms and Conditions” page opens in new tab$")
    public void verifyTandC(){
        supage.currentWindowHandle();
         Assert.assertEquals(supage.getTextTaC(),"Terms and Conditions", "test failed");
         MyDriver.getDriver().close();
         MyDriver.getDriver().switchTo().window(supage.getParentHandle());
     }

    @When("^I click “Privacy Statement” link$")
    public void privacyStatementClick() {
        supage.clickPrivacyStatement();
    }
    @Then ("^I verify “Privacy Statement” page opens in new tab$")
    public void verifyPrivacyStatement(){
        supage.currentWindowHandle();
        Assert.assertEquals(supage.getTextPrivacySttement(),"Privacy Statement", "test failed");
        MyDriver.quitWindows();
    }


//    Spr 2 TC 22

    @When("^Enter signup email (.+) in signup window$")
    public void invalidEmailSignUp(String input){
        supage.enterEmailSignUp(input);
    }
    @When("^Enter invalid first name (.+)$")
    public void invalidFirstNameSignUp(String input){
        supage.enterFirstNameSignUp(input);
    }
    @When("^Enter invalid last name (.+)$")
    public void invalidLastNameSignUp(String input){
        supage.enterLastNameSignUp(input);
    }
    @When("^Enter password (.+)$")
    public void invalidPasswordSignUp(String input){
        supage.enterPasswordSignUp(input);
    }

    @Then("^I verify error is displayed Enter a valid email address$")
    public void isEmailErrorDisplayed(){
        Assert.assertTrue(supage.emailError(),"test failed");
    }
    @Then("^I verify error is displayed First name cannot contain special characters$")
    public void isFirstNameErrorDisplayed(){
        Assert.assertTrue(supage.fistNameError(),"test failed");
    }
    @Then("^I verify error is displayed Last name cannot contain special characters$")
    public void isLastNameErrorDisplayed(){
        Assert.assertTrue(supage.lastNameError(),"test failed");
    }
    @Then("^I verify “Keep me signed in” checkbox is displayed and enabled$")
    public void isCheckBoxDisplayedAndEnabled(){
        Assert.assertTrue(supage.isCheckboxDisplayed(),"test failed");
        Assert.assertTrue(supage.isCheckboxEnabled(),"test failed");
    }
    @Then("^I verify Continue button is displayed and disabled$")
    public void continueBtIsDisplayedAndDisabled(){
        Assert.assertTrue(supage.isContinueBtDisplayed(),"test failed");
        Assert.assertFalse(supage.isContinueBtDisabled(),"test failed");
        MyDriver.quitWindows();
    }




}

