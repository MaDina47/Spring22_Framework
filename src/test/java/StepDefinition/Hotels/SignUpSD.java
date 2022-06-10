package StepDefinition.Hotels;

import Pages.Hotels.SignIn;
import Pages.Hotels.SignUP;
import Web.MyDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

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




}

