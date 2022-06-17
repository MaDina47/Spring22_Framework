package Pages.Hotels;

import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;

import java.util.Set;

public class SignUP extends Commands {

    By termsAndConditionLc = By.linkText("Terms and Conditions");
    By privacyStatementLc = By.linkText("Privacy Statement");
    By termsAndConditionsHeadinLc = By.xpath("//h1[contains(text(),'Terms and Conditions')]");


//      By emailInputLocator = By.id("signupFormEmailInput");
        By emailInputLC = By.xpath("//input[@id='signupFormEmailInput']");


      By firstNameInputBoxLc = By.id("signupFormFirstNameInput");

      By lastNameInputBoxLc = By.id("signupFormLastNameInput");
      By passwordInputBoxLc = By.id("signupFormPasswordInput");
//      By checkBoxLc = By.id("signUpFormRememberMeCheck");
      By checkBoxLc1 = By.xpath("//span[@class='uitk-flex-item uitk-flex-shrink-0 uitk-switch-control']");
      By enterValidEmailError = By.id("signupFormEmailInput-error");
      By enterFirstNameError = By.id("signupFormFirstNameInput-error");
      By enterLastNameError = By.id("signupFormLastNameInput-error");
      By continueButtonLc = By.id("signupFormSubmitButton");


    public void clickTermsAndConditions(){
        clickIt(termsAndConditionLc);
    }
    public void clickPrivacyStatement(){
        clickIt(privacyStatementLc);
    }

    String parentHandle;

    public void currentWindowHandle() {
        parentHandle = MyDriver.getDriver().getWindowHandle();
        Set<String> allHandles = MyDriver.getDriver().getWindowHandles();
        for (String handle : allHandles) {
            if (!handle.equalsIgnoreCase(parentHandle)) {
                MyDriver.getDriver().switchTo().window(handle);
            }
        }
    }

    public String getParentHandle() {
        return parentHandle;
    }

    public String getTextTaC(){
        return getTextOfWebElement(termsAndConditionsHeadinLc);
        }
    public String getTextPrivacySttement(){
        return getTextOfWebElement(privacyStatementLc);
    }

   public void enterEmailSignUp(String input){
        type(emailInputLC,input);
   }
    public void enterFirstNameSignUp(String input){
        type(firstNameInputBoxLc,input);
    }
    public void enterLastNameSignUp(String input){
        type(lastNameInputBoxLc,input);
    }
    public void enterPasswordSignUp(String input){
        type(passwordInputBoxLc,input);
    }

    public boolean emailError(){
        return isElementDisplayed(enterValidEmailError);
    }
    public boolean fistNameError(){
        return isElementDisplayed(enterFirstNameError);
    }
    public boolean lastNameError(){
        return isElementDisplayed(enterLastNameError);
    }
    public boolean isCheckboxDisplayed(){
//        return isElementDisplayed(checkBoxLc);
        return isElementDisplayed(checkBoxLc1);
    }
    public boolean isCheckboxEnabled(){
        return isElementEnabled(checkBoxLc1);
    }

    public boolean isContinueBtDisplayed(){
        return isElementDisplayed(continueButtonLc);
    }
    public boolean isContinueBtDisabled(){
        return isElementEnabled(continueButtonLc);
    }








    }









