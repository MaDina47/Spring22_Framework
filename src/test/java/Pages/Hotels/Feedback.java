package Pages.Hotels;

import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class Feedback extends Commands {
    By feedbackLocator = By.xpath("//a[@target='_blank']/div[contains(text(),'Feedback')]");
    By submitButtonLocator = By.xpath("//button[@id='submit-button']");
    By feedbackErrorLc = By.xpath("//p[contains(text(),'Please fill in ')]");
    By redBoxLc = By.xpath("//fieldset[@style='padding: 5px; border: 2px dotted rgb(204, 0, 0);']");

    By ratingButtons = By.xpath("//label[contains(@for,'page-rating-5')]");
    By textBox = By.id("verbatim");
    //textarea[@id='verbatim']
    By chooseBox = By.id("will-you-return");
    By thankYouHeader = By.xpath("//h5[contains(text(),'THANK YOU FOR YOUR FE')]");


    public void selectStar(String value) {
        By selectStar = By.xpath("//label[contains(@for,'page-rating-" + value + "')]");
        clickIt(selectStar);
    }

    public void priorToVisitSelection(String value){
//      By selectPriorToVisit = By.xpath("//div[@class='radio-button']//label[@for='booked-here-before-" + value + "']");
      //By selectPriorToVisit = By.xpath("//div[@class='radio-button']//label[@for='booked-here-before-yes']");
        By selectPriorToVisit = By.xpath("(//span[contains(text(), '" +value+ "')])[1]");
        clickIt(selectPriorToVisit);
    }

    public void accomplishOptionMenu(String value){
//        By selectAccomplish = By.xpath("//label[@for='were-you-successful-yes']");
        By selectAccomplish = By.xpath("(//span[contains(text(), '" +value+ "')])[2]");
        clickIt(selectAccomplish);
    }

    public boolean thankYouForFeedbackIsDisplayed(){
        return isElementDisplayed(thankYouHeader);
//        return getTextOfWebElement(thankYouHeader);
    }

    public void clickFeedback(){
        clickIt(feedbackLocator);
    }
     public void scrollToSubmitButtonAndClick(){
        scrollToElement(submitButtonLocator).click();
     }
     public boolean feedbackErrorIsDisplayed(){
        return isElementDisplayed(feedbackErrorLc);
     }

     public boolean isRedBoxDisplayed(){
        return isElementDisplayed(redBoxLc);
     }

     public void typeInPageComments(String input){
        type(textBox,input);
     }
     public void selectFromPleaseChooseOne(String input){
        selectInDropdown(chooseBox,input);
     }

















}
