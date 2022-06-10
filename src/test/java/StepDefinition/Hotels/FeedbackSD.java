package StepDefinition.Hotels;

import Helper.Misc;
import Pages.Hotels.Feedback;
import Pages.Hotels.LandingPage;
import Pages.Hotels.SignUP;
import Web.MyDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.function.Function;

public class FeedbackSD {
    LandingPage lpage = new LandingPage();
    Feedback fpage =new Feedback();
    SignUP supage = new SignUP();

//    TC 24

    @When("^I select “Website feedback” from Help dropdown$")
    public void clickFeedback(){
//        Misc.pause(2);
        fpage.clickFeedback();
        supage.currentWindowHandle();
        System.out.println(MyDriver.getDriver().getCurrentUrl());
        Misc.pause(3);
    }
    @When("^I click on Submit button$")
    public void clickSubmitBt(){
        fpage.scrollToSubmitButtonAndClick();
    }
    @Then("I verify error message is displayed Please fill in the required information highlighted below")
    public void IsFeedbackErrorDisplayed(){
        Assert.assertTrue(fpage.feedbackErrorIsDisplayed());
    }

    @Then("I verify star boxes section is in a red dotted box")
    public void redBoxIsDisplayed(){
        Assert.assertTrue(fpage.isRedBoxDisplayed());
        MyDriver.quitWindows();
    }
//    String expected = "rgb(204, 0, 0)";
//    @Then("I verify star boxes section is in a red dotted box")
//    public void getAtrr(){
//        Assert.assertEquals(expected,fpage.getColor(),"failed");
//       System.out.println(fpage.getColor());
//    }


//    TC 19
    @When("^Enter (.+) in destination$")
    public void enterDestination(String destination){
        lpage.enterDestination(destination);
        Misc.pause(3);
    }

    @When("^I select (.+), Leeward Islands, French Polynesia from auto suggestion$")
    public void destination(String where){
        lpage.selectFromDestinationSuggestion(where);
        Misc.pause(3);
    }

    @When("^I select (.+) as check-in$")
    public void selectCheckInDateInCheckIn(String value) {
        lpage.clickCheckInBox();
        lpage.selectDayMonthYear(value);
        lpage.clickDoneInCheckInAndOutBtn();
        //Misc.pause(3);
    }

    @When("^I select (.+) as check-out$")
    public void selectCheckInDateInCheckOut(String value) {
        lpage.clickCheckOutBox();
        Misc.pause(1);
        lpage.selectDayMonthYear(value);
    }
    @When("^I click apply$")
    public void clickDoneCheckOut(){
        lpage.clickDoneInCheckInAndOutBtn();
    }

    @Then("^I verify text: Tell us how we can improve our site is displayed$")
    public void isTextDisplayed(){
        Assert.assertTrue(lpage.isImprovementMessageDisplayed());
    }

    @Then("^I verify Button Share feedback is displayed and enabled$")
    public void isShareFeedbackBtEnabled(){
        Assert.assertTrue(lpage.IsShareFeedbackEnabled());
        MyDriver.quitWindows();
    }















}
