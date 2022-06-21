package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FilterAndSort extends Commands {
    By destinationInputBoxLocator = By.xpath("//button[@aria-label='Going to']");
    By enterTextDestination = By.xpath("//div/input[contains(@class, 'uitk-typeahead-input') and contains(@id,\"destination\")] ");
    By sortByBoxLc = By.xpath("//select[@id='sort']");

    //    By destinationInputLocator = By.id("//input[@id='destination_form_field']");
    By destinationInputLocator = By.id("//div[@class='uitk-typeahead-input-wrapper']//input[contains(@id, 'destination')]");

    By destinationSuggestions = By.xpath("//div[@class='uitk-typeahead-results']//div[contains(@class,'truncat') and not(contains(@class,'uitk'))]");

//    By starRatingSelection = By.xpath("//div[@class='uitk-button-toggle-group property-class-input uitk-button-toggle-group-wrap']//input[contains(@aria-label,'5')]");
    By starRatingSelection1 = By.xpath("//label[contains(@aria-label,'3')]");

    By finalHotelPrice = By.xpath("//*[@data-test-id='price-summary-message-line']//div[contains(text(),'The price is')]/following-sibling::span/div");
    By selectedStarFilterVerificationLocator = By.xpath("//div[@class='all-b-padding-half']//div/span");

    public int getLowestPrice() {
        String price = getTextOfWebElement(finalHotelPrice);
        return Integer.valueOf(price.substring(1));
    }

    public boolean verifyAppliedPriceFilter() {
        List<WebElement> hotelPrices = findWebElements(finalHotelPrice);
        System.out.println(hotelPrices.size());
        boolean isPriceFilterCorrect = true;
        for (int i = 0; i < hotelPrices.size() - 1; i++) {
            String currentPrice = hotelPrices.get(i).getText().substring(1); //$100
            String nextPrice = hotelPrices.get(i + 1).getText().substring(1); // $150
            if (Integer.valueOf(currentPrice) > Integer.valueOf(nextPrice)) { // $100 > $150
                isPriceFilterCorrect = false; // <-----
            }
            System.out.println("Current = "+currentPrice + " | " + "Next = " + nextPrice);
            System.out.println("");
        }
        //System.out.println(isPriceFilterCorrect);
        return isPriceFilterCorrect;
    }

    public boolean verifyAppliedStarFilter() {
        List<WebElement> starFilterDescription = findWebElements(selectedStarFilterVerificationLocator);
        boolean isStarFilterCorrect = true;
        for (WebElement description : starFilterDescription) {
            if (!description.getText().equalsIgnoreCase("5 out of 5")) {
                isStarFilterCorrect = false;
            }
        }
        return isStarFilterCorrect;
    }

    public void enterWhereToGo(String value) {
        clickIt(destinationInputBoxLocator);
        type(enterTextDestination, value);
    }

    public void selectStarRating(String value){
        scrollByPixel("650");
     // clickIt(starRatingSelection1);
        By selectStar = By.xpath("//label[contains(@aria-label,'" + value+ "')]");
        clickIt(selectStar);
        }

    public void selectPrice(String value){
        selectInDropdown(sortByBoxLc,"Price");
        Misc.pause(5);
    }





}
