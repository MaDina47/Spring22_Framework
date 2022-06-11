package StepDefinition.Hotels;

import Helper.DateLib;
import Helper.Misc;
import Pages.Hotels.LandingPage;
import Web.MyDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CalendarSD {

    LandingPage lpage = new LandingPage();
    @When("^I click on Check-in Calendar$")
    public void clickCheckIn(){
        lpage.clickCheckInBox();
    }
    @Then("^I verify past dates if any are disabled$")
    public void disabledDays(){
     Assert.assertEquals(DateLib.getCurrentDateAsInt()-1, lpage.disabledDaysFromCheckIn(),"test failed");
    }

    @Then("^I verify back button on current month is disabled$")
    public void backButtonDisabled(){
        Assert.assertTrue(lpage.isLeftArrowDisabled());
    }
    @When("I click on Done button on calendar$")
    public void clickDone(){
        lpage.clickDoneInCheckInAndOutBtn();
//        Misc.pause(2);
    }
    @When("^I click on Check-out Calendar$")
    public void clickCheckOut(){
        lpage.clickCheckOutBox();
    }
    @Then("^I verify past dates if any are disabled in Check-out$")
    public void disabledDaysCheckoutBox(){
        Assert.assertEquals(DateLib.getCurrentDateAsInt()-1, lpage.disabledDaysFromCheckOut(),"test failed");
    }














}
