package Pages.Hotels;


import Helper.Misc;
import Pages.Commands;
import Web.MyDriver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DealsMethods extends Commands {

    By moreTravelLc = By.xpath("//div[contains(text(),'More travel')]");
    By dealsFromMoreTravelLc = By.xpath("//a[@href='/hotel-deals/']");
    By dealsFromMoreTravelLc1 = By.xpath("//div[@class='uitk-list']//a[@href='/lp/b/deals']");

//    By manageBookingLc = By.xpath("a[@href='https://www.hotels.com/page/app/?intlid=DH_app_pos1_360x190_en-us']");
    By manageBookingLc = By.xpath("//div[@class='resp-module']//a[@href='https://www.hotels.com/page/app/?intlid=DH_app_pos1_360x190_en-us']");
    By freeCancellationLc = By.xpath("//div[@class='resp-module']//a[@href='https://www.hotels.com/page/free-cancellation/?intlid=DH_freecancellation_pos2_360x190_en-us']");
    By saveNextTripLc = By.xpath("//div[@class='resp-module']//a[@href='https://www.hotels.com/hotel-deals/nature?intlid=dh_Nature_pos3_US']");
    By searchBookHeaderLc = By.xpath("//h1[contains(text(),'Search, book, and save on the go!')]");
    By amazingDealsHeaderLc = By.xpath("//h1[contains(text(),'Amazing deals with free cancellation')]");
    By saveOnNextTripHeaderLc = By.xpath("(//h1[contains(text(),'Save on your next trip to the great outdoors')])[1]");

    public void clickMoreTravelMenu(){
        clickIt(moreTravelLc);
    }

    public void goBack(){
        backToPreviousPage();
    }
    public void moreTravelOptionMenu(){
        clickIt(moreTravelLc);
        clickIt(dealsFromMoreTravelLc1);
        scrollByPixel("500");
    }


    public void launchHotelDealsPg(){
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com/hotel-deals/");
        MyDriver.getDriver().manage().window().maximize();

    }
    public boolean manageTripIsDisplayed(){
        return isElementDisplayed(manageBookingLc);
    }
    public boolean manageTripIsEnabled(){
        return isElementEnabled(manageBookingLc);
    }
    public boolean freeCancellationIsDisplayed(){
        return isElementDisplayed(freeCancellationLc);
    }
    public boolean freeCancellationIsEnabled(){
        return isElementEnabled(freeCancellationLc);
    }
    public boolean saveNextTripIsDisplayed(){
        return isElementDisplayed(saveNextTripLc);
    }
    public boolean saveNextTripIsEnabled(){
        return isElementEnabled(saveNextTripLc);
    }
    public void clickManageTrip(){
        clickIt(manageBookingLc);
    }

    public boolean isHeaderDisplayed(){
        return isElementDisplayed(searchBookHeaderLc);
    }
    public void clickSaveTrip(){
        clickIt(freeCancellationLc);
    }
    public boolean isSaveTripHeaderDisplayed(){
        return isElementDisplayed(amazingDealsHeaderLc);
    }

    public void clickSaveOnNextTrip(){
        clickIt(saveNextTripLc);
    }
    public boolean isSaveOnNextTripHeaderDisplayed(){
        return isElementDisplayed(saveOnNextTripHeaderLc);
    }















}
