package Pages.Hotels;

import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;

import java.util.Set;

public class SignIn extends Commands {

    By emailLocator = By.id("loginFormEmailInput");
    By passwordLocator = By.id("loginFormPasswordInput");
    By signInButtonLocator = By.id("loginFormSubmitButton");
    By signInErrorLocator = By.xpath("//h3[@class='uitk-error-summary-heading']");
    By signUpButtonLocator = By.xpath("//a[contains(text(),'Sign up, it’s free')]");


//    public void invalidEmail(String input){
//        type(emailLocator,"gasrur@tt.12");
//    }
    public void invalidEmail(String input){
        type(emailLocator,input);
    }

    public void invalidPassword(String input){
        type(passwordLocator,input);
    }
    public void clickSignInButton(){
        clickIt(signInButtonLocator);
    }

    public boolean isErrorDisplayed(){
        return isElementDisplayed(signInErrorLocator);
    }

    public void clickSignUpButton(){
        clickIt(signUpButtonLocator);
    }




}
