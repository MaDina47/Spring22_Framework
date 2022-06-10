package StepDefinition.Darksky;

import Helper.Misc;
import Pages.Darksky.LandingPageHW5;
import Web.MyDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSD<tab> {
    LandingPageHW5 lpage = new LandingPageHW5();

    @Given("I am on Darksky.com")
    public void launchDarksky(){
//        MyDriver.launchUrlOnNewWindow("https://www.darksky.net/");
        lpage.launchDarksky();
    }
    @When("^I scroll down to TimeMachine Button$")
    public void scrollToTM(){
//        lpage.scrollToTodayBarByPixel();
       lpage.scrollToTimeMachineBtnByPixel();
        Misc.pause(3);
    }

    @Then("^I click on TM button$")
    public void clickOnTM(){
        lpage.timeMachineClick();
        Misc.pause(4);
    }
    @Then("^I verify the date in TimeMachine is matching current date$")
    public void verifyDates(){
        Assert.assertEquals(lpage.getAttributeOfCurrentDate(),lpage.todayDate(),"test failed");
    }

    @Then("^I quit Darksky.com$")
        public void quit(){
        MyDriver.quitWindows();
    }

    @When ("^I scroll down to Today tab$")
    public void scrollToTodayBar(){
        //lpage.scrollToTodayBarByPixel();
        lpage.scrollToElIntoViewTodayBar();
        Misc.pause(3);


    }
    @Then("^I click on Today tab$")
    public void clickTodayBar(){
        lpage.todayClick();
    }
    @Then("^I verify same temperature values are displayed in the Today's data$")
    public void verifyTemp(){
       Assert.assertEquals(lpage.getMinTempText(),lpage.getMinTpTextToCompare(),"doesn't match");
       Assert.assertEquals(lpage.getMaxTempText(),lpage.getMaxTpTextToCompare(),"doesn't match");
    }






}
