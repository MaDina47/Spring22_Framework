package StepDefinition.Hotels;

import Helper.Misc;
import Pages.Hotels.LandingPage;
import Web.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageSD {
    LandingPage lpage = new LandingPage();
    String beforeText = "";
    String afterText = "";

    @Given("^I am on Hotels.com$")
    public void hotelsPageLaunch(){
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com");
    }

    @When("^I click search button$")
    public void clickSearchButton(){
        lpage.clickOnSearchBt();
    }

    @Then("^I verify destination error is displayed$")
    public void isErrorDisplayed(){
        Assert.assertTrue(lpage.isDestinationErrorDisplayed());
        MyDriver.quitWindows();}

    @When("^I click on Travelers Box$")
    public void clickTravelersBox()
    {lpage.travelersBoxClick();}

    @When("^I add number of children$")
    public void addNumberOfChildren(){
        lpage.increaseNumberOfChildrenBt(2);}

    @Then("^I verify the age error is displayed$")
    public void isAgeErrorDisplayed(){
        Assert.assertTrue(lpage.isAgeErrorDisplayed());}

    @When("^I add the children's age$")
    public void addChildrenAge(){
        lpage.addAgeBox1("15");
        lpage.addAgeBox2("4");
    }
    @When("^I verify the age error is not displayed$")
    public void errorIsNotDisplayed(){
        Assert.assertFalse(lpage.isAgeErrorDisplayed());
    }
    @Then("^I click on Done button$")
    public void clickDoneBt(){
        lpage.clickDoneButton();
        Misc.pause(3);
       // MyDriver.quitWindows();
    }
    @Then("^I get the text from Travelers box$")
    public void textFromTravelers(){
        beforeText = lpage.getTextOfTravelerBox();
    }

    @When("^I enter the destination$")
    public void iEnterTheDestination(){
        lpage.enterDestination("Island");
    }

    @Then("^I verify numbers of travelers before and after is the same$")
    public void verifyNumberOfTravelers(){
         afterText = lpage.getTextOfTravelerBox();
        Assert.assertEquals(beforeText,afterText,"both text are matching");
        MyDriver.quitWindows();
    }












    }





