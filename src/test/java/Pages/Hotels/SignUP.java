package Pages.Hotels;

import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;

import java.util.Set;

public class SignUP extends Commands {

    By termsAndConditionLc = By.linkText("Terms and Conditions");
    By privacyStatementLc = By.linkText("Privacy Statement");
    By termsAndConditionsHeadinLc = By.xpath("//h1[contains(text(),'Terms and Conditions')]");

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









    }









