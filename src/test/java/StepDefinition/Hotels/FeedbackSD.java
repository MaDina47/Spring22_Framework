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
    Feedback fpage = new Feedback();
    SignUP supage = new SignUP();

//    TC 24

    @When("^I select “Website feedback” from Help dropdown$")
    public void clickFeedback() {
//        Misc.pause(2);
        fpage.clickFeedback();
        supage.currentWindowHandle();
        System.out.println(MyDriver.getDriver().getCurrentUrl());
        Misc.pause(3);
    }

    @When("^I click on Submit button$")
    public void clickSubmitBt() {
        fpage.scrollToSubmitButtonAndClick();
        Misc.pause(1);
    }

    @Then("I verify error message is displayed Please fill in the required information highlighted below")
    public void IsFeedbackErrorDisplayed() {
        Assert.assertTrue(fpage.feedbackErrorIsDisplayed());
    }

    @Then("I verify star boxes section is in a red dotted box")
    public void redBoxIsDisplayed() {
        Assert.assertTrue(fpage.isRedBoxDisplayed());
        MyDriver.quitWindows();
    }

    //    TC 19
    @When("^In destination box I enter (.+)$")
    public void enterDestination(String destination) {
        lpage.enterDestination(destination);
        Misc.pause(3);
    }

    @When("^I select (.+), Leeward Islands, French Polynesia from auto suggestion$")
    public void destination(String where) {
        lpage.selectFromDestinationSuggestion(where);
        Misc.pause(3);
    }

    @When("^I select 1-10 August, 2022 as check-in$")
    public void selectCheckInDateInCheckIn() {
        lpage.clickCheckInBox();
        lpage.selectDayMonthYear("1 August 2022");
        lpage.selectDayMonthYear("10 August 2022");
        lpage.clickDoneInCheckInAndOutBtn();
        //Misc.pause(3);
    }

    @When("^I select (.+) as check-out$")
    public void selectCheckInDateInCheckOut(String value) {
//        lpage.clickCheckOutBox();
        lpage.clickCheckInBox();
        Misc.pause(1);
        lpage.selectDayMonthYear(value);
    }

    @When("^I click apply$")
    public void clickDoneCheckOut() {
        lpage.clickDoneInCheckInAndOutBtn();
    }

    @Then("^I verify text: Tell us how we can improve our site is displayed$")
    public void isTextDisplayed() {
        Assert.assertTrue(lpage.isImprovementMessageDisplayed());
    }

    @Then("^I verify Button Share feedback is displayed and enabled$")
    public void isShareFeedbackBtEnabled() {
        Assert.assertTrue(lpage.IsShareFeedbackEnabled());
        MyDriver.quitWindows();
    }

//     Sprint 2 TC 25

    @When("^I select star-rating (.+)$")
    public void rating(String input) {
        fpage.selectStar(input);
    }

    @When("^I enter (.+)$")
    public void typeInTextBox(String input) {
        fpage.typeInPageComments(input);
    }

    @When("^I select (.+) from How likely are you to return to Hotels com dropdown$")
    public void selectOptionFromDropdown(String input) {
        fpage.selectFromPleaseChooseOne(input);
    }

    @When("^I select (.+) in Prior to this visit have you ever booked on Hotels com option menu$")
    public void priorToVisitSelectionYesOrNo(String input) {
        fpage.priorToVisitSelection(input);
    }

    @When("^I select (.+) for Did you accomplish what you wanted to do on this page$")
    public void accomplishSelection(String input) {
        fpage.accomplishOptionMenu(input);
    }

    @Then("^I verify “THANK YOU FOR YOUR FEEDBACK.“ is displayed$")
    public void isThankYouHeaderDisplayed() {
        Assert.assertTrue(fpage.thankYouForFeedbackIsDisplayed(), "Thank you header is not displayed");
//        System.out.println(fpage.thankYouForFeedbackIsDisplayed());
        MyDriver.quitWindows();
    }














}
