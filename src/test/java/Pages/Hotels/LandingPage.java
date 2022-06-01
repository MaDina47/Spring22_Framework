package Pages.Hotels;

import Pages.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage extends Commands {

    //
    By searchButtonLocator = By.xpath("//button[@data-testid='submit-button']");
    By destinationErrorLocator = By.xpath("//h3[contains(text(),' continue, please')]");
    By travellersBoxLocator = By.xpath("//button[@data-testid='travelers-field-trigger' and @type='button']");
    By increseChildrenBtLocator = By.xpath("//span[@class='uitk-step-input-button']//*[@aria-label='Increase children in room 1']");
    By ageErrorLocator = By.xpath("//h3[contains(text(),'e the ages of children.')]");
    By childAgeBox1 = By.id("child-age-input-0-0");
    By childAgeBox2 = By.id("child-age-input-0-1");
    By doneButtonLocator = By.xpath("//button[@data-testid='guests-done-button']");

    By checkInDateBoxLocator = By.id("d1-btn");
    By checkInDisabledDatesLocator = By.xpath("//table[@class='uitk-date-picker-weeks']//button[@disabled]");

    By june2022DatesLocator = By.xpath("//h2[text()='June 2022']/following-sibling::table//button[@data-day]");
    /*

        monthYear = August 2022
        "//h2[text()='" + monthYear + "']/following-sibling::table//button[@data-day]"
        monthDates_1 + monthYear + monthDates_2
     */
    String monthDates_1 = "//h2[text()='";
    String monthDates_2 = "']/following-sibling::table//button[@data-day]";

    By calendarHeading = By.xpath("(//div[@data-stid='date-picker-month'])[1]//h2");
    By nextMonthArrow = By.xpath("(//button[@data-stid='date-picker-paging'])[2]");

    By destinationInputBoxLocator = By.xpath("//button[@aria-label='Going to']");
    By destinationInputLocator = By.id("location-field-destination");
    By destinationSuggestions = By.xpath("//div[@class='uitk-typeahead-results']//div[contains(@class,'truncat') and not(contains(@class,'uitk'))]");

    public void clickOnSearchBt(){
        clickIt(searchButtonLocator);
    }
    public void clickCheckInBox() {
        clickIt(checkInDateBoxLocator);
    }

    public boolean isDestinationErorDisplayed(){
       return isElementDisplayed(destinationErrorLocator);
    }
    public void travelersBoxClick(){
        clickIt(travellersBoxLocator);
    }

    public void increaseNumberOfChildrenBt(int number) {
        for (int i = 0; i < number; i++ ) {
            clickIt(increseChildrenBtLocator);}
    }

    public boolean isAgeErrorDisplayed(){
        try {
            findWebElement(ageErrorLocator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }

    }
    public void addAgeBox1(String value){
        selectByValue(returnWebElement(childAgeBox1), value );}

    public void addAgeBox2(String value){
        selectByValue(returnWebElement(childAgeBox2), value );}

    public void clickDoneButton(){
        clickIt(doneButtonLocator);
    }
    public String getTextOfTravelerBox(){
       return getTextOfWebElement(travellersBoxLocator);
    }








    public List<WebElement> getAllDisabledDates() {
        return findWebElements(checkInDisabledDatesLocator);
    }

    public void selectDateInJune2022(String dateToSelect) {
        selectDateInCalendar(june2022DatesLocator, dateToSelect);
    }

    public void enterDestination(String destination) {
        clickIt(destinationInputBoxLocator);
        type(destinationInputLocator, destination);
    }

    public void selectFromDestinationSuggestion(String userChoice) {
        selectFromSuggestions(destinationSuggestions, userChoice);
    }

    public void goToMonth(String monthYear) {
        for (int i=0 ; i<12 ; i++) {
            if (getTextOfWebElement(calendarHeading).equalsIgnoreCase(monthYear)) {
                break;
            }
            clickIt(nextMonthArrow);
        }
    }

    public void selectDateFromAnyMonth(String monthYear, String dateValue) {
        goToMonth(monthYear);
        By allDatesLocator = By.xpath(monthDates_1 + monthYear + monthDates_2);
        selectDateInCalendar(allDatesLocator, dateValue);
    }


    public void selectDateFromAnyMonth(String dateMonthYear) {
        String[] dateValues = dateMonthYear.split(" ");
        goToMonth(dateValues[1] + " " + dateValues[2]);
        By allDatesLocator = By.xpath(monthDates_1 + dateValues[1] + " " + dateValues[2] + monthDates_2);
        selectDateInCalendar(allDatesLocator, dateValues[0]);
    }



}
