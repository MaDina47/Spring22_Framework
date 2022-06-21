package StepDefinition.Hotels;

import Pages.Hotels.DealsMethods;
import Web.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


// Sprint 2 TC 26
public class DealsSD {
    DealsMethods dpage = new DealsMethods();

    @Given("^I launch Hotels.com/deals$")
    public void launchPage(){
        dpage.launchHotelDealsPg();
    }

//    @When("^Using “More travel” go to \"Deals\" page$")
//    public void moreTravelDropdown() {
//        dpage.moreTravelOptionMenu();
//    }

    @Then("^I verify “Manage your booking anytime, anywhere” is displayed and enabled$")
    public void manageBookingIsDisplayedAndEnabled() {
        Assert.assertTrue(dpage.manageTripIsDisplayed(), "text failed");
        Assert.assertTrue(dpage.manageTripIsEnabled(), "text failed");
    }

    @Then("^I verify “Stay Flexible with free cancellation” is displayed and enabled$")
    public void freeCancellationIsDisplayedAndEnabled() {
        Assert.assertTrue(dpage.freeCancellationIsDisplayed(), "text failed");
        Assert.assertTrue(dpage.freeCancellationIsEnabled(), "text failed");
    }

    @Then("^I verify “Save on your next trip to the great outdoors” is displayed and enabled$")
    public void saveNextTripIsDisplayedAndEnabled() {
        Assert.assertTrue(dpage.saveNextTripIsDisplayed(), "text failed");
        Assert.assertTrue(dpage.saveNextTripIsEnabled(), "text failed");
    }

    @When("^I click on Manage your booking anytime anywhere$")
    public void clickManageTrip() {
        dpage.clickManageTrip();
    }

    @Then("^I verify “Search, book and Save on the go!” title is displayed$")
    public void isHeaderSearchDisplayed() {
        Assert.assertTrue(dpage.isHeaderDisplayed());
    }

    @When("^I go back$")
    public void back() {
        dpage.goBack();
    }

    @When("^I click on “Stay Flexible with free cancellation”$")
    public void clickFreeCancellation() {
        dpage.clickSaveTrip();
    }

    @Then("^I verify “Amazing deals with free cancellation” OR “Stay Flexible with free cancellation” title is displayed$")
    public void isHeaderDisplayed() {
        Assert.assertTrue(dpage.isSaveTripHeaderDisplayed());
    }

    @When("^I click on “Save on your next trip to the great outdoors”$")
    public void clickSaveNextTrip() {
        dpage.clickSaveOnNextTrip();
    }

    @Then("^I verify “Save on your next trip to the great outdoors” title is displayed$")
    public void isSearchHeaderDisplayed() {
        Assert.assertTrue(dpage.isSaveOnNextTripHeaderDisplayed());
        MyDriver.quitWindows();
    }


}
