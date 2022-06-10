package StepDefinition.Hotels;

import Helper.Misc;
import Pages.Hotels.LandingPage;
import Web.MyDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TravelersBoxSD {
    LandingPage lpage = new LandingPage();
    String beforeText = "";
    String afterText = "";

//  TC  18

    @When("^I click on Travelers$")
    public void clickTravelersBox()
    {lpage.travelersBoxClick();}

    int totalAdults;
    @When("^I select “Adults as (.+)$")
    public void addNumberOfAdults(Integer input){
        lpage.increaseNumberOfAdultsBt(input);
        totalAdults = input+2;
//        System.out.println(totalAdults);
    }
    int totalChildren;
    @When("^I select “Children” as (.+)$")
    public void addNumberOfChildren(Integer input){
        lpage.increaseNumberOfChildrenBt(input);
        totalChildren = input;
    }

    @When("^I select first child age: (.+)$")
    public void addChildrenAge1(String input){
        lpage.addAgeBox1(input);
        Misc.pause(3);
    }
    @When("^I select second child age: (.+)$")
    public void addChildrenAge2(String input){
        if (input.equalsIgnoreCase("Under 1")) {
            input = "0";
        }
        lpage.addAgeBox2(input);
    }

    @Then("^I click Done$")
    public void clickDoneBt(){
        lpage.clickDoneButton();
        Misc.pause(3);
        // MyDriver.quitWindows();
    }

    @Then("^I verify total number of guests in sum of adults and children as same as selected on step #3 and #4.$")
    public void verifyNumberOfTravelers(){
        int totalGuests = totalAdults+totalChildren;
        Assert.assertEquals(String.valueOf(totalGuests),lpage.splitText(),"test failed");
        MyDriver.quitWindows();
    }








}
