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

//    public String getColor(){
//
//        WebElement wb = findWebElement(redBoxLc);
//        String value = findWebElement(redBoxLc).getAttribute("style");
//        String[] spl = value.split("d");
//        String spl1 = spl[5];
//        String[] spl2 = spl1.split(";");
//
//        return spl2[0];
//    }

















}
