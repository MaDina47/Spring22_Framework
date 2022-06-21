package StepDefinition.Hotels;

import Helper.Misc;
import Pages.Hotels.FilterAndSort;
import Pages.Hotels.LandingPage;
import Web.MyDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class FilterAndSortSD {
    LandingPage lpage = new LandingPage();
    FilterAndSort fs = new FilterAndSort();


    @When("^Enter (.+) in destination box$")
    public void enterDestination(String destination) {
//        lpage.enterDestination(destination);
        fs.enterWhereToGo(destination);
        Misc.pause(3);
    }

    @When("^I select (.+) NY from auto suggestion$")
    public void destination(String value) {
        lpage.selectFromDestinationSuggestion(value);
        Misc.pause(3);
    }

    @When("^I select 10-15 August 2022 in Dates Box$")
    public void selectDatesBox() {
        lpage.clickCheckInBox();
        lpage.selectDayMonthYear("10 August 2022");
        lpage.selectDayMonthYear("15 August 2022");
        lpage.clickDoneInCheckInAndOutBtn();
        //Misc.pause(3);
    }

    @When("^I click on (.+) star from star-rating filter$")
    public void clickStarRating(String input) {
        fs.selectStarRating(input);
    }

    @When("^I select (.+) from sort-by dropdown$")
    public void selectSortByOption(String input) {
        fs.selectPrice(input);
    }

    @Then("I verify all hotels in search results are *-rated as selected in above step")
    public void verifyStarFilterDescription() {
        Assert.assertTrue(fs.verifyAppliedStarFilter(),"Test Fail - Star filter was wrong");
    }

    @Then("I verify all hotels are listed in increasing order price")
    public void verifyPriceFilterValues() {
        Assert.assertTrue(fs.verifyAppliedPriceFilter(),"Test Fail - Price filter was not correct");
        MyDriver.quitWindows();
    }








}
