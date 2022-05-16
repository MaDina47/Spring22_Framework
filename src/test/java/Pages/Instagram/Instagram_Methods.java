package Pages.Instagram;

import Helper.Misc;
import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Set;

public class Instagram_Methods extends Commands {

        By fbPay = By.linkText("Facebook Pay");
        By oculus = By.linkText("Oculus");
        By instagram = By.linkText("Instagram");
        By portal = By.linkText("Portal");
        By bulletin = By.linkText("Bulletin");

        By instagramLogInBtn = By.xpath("//button[@disabled]");

        public void clickMultipleTabs(){
            clickIt(fbPay);
            clickIt(oculus);
            clickIt(instagram);
            clickIt(portal);
            clickIt(bulletin);
        }
        public Set<String> getMultipleHandles() {
            Set<String> allHandles = MyDriver.getDriver().getWindowHandles();
          return allHandles;
        }
        public String pageTitle() {
           return MyDriver.getDriver().getTitle();
        }

        public void closeTabs() {
            Set<String> allHandles = MyDriver.getDriver().getWindowHandles();
            String instagramPg = "";
             for (String tab : allHandles) {
               MyDriver.getDriver().switchTo().window(tab);
               Misc.pause(2);
               if (pageTitle().equals("Instagram")) {
                  instagramPg = getCurrentWindowHandle();
            }
               if (!pageTitle().equals("Instagram")) {
                   MyDriver.getDriver().close();
            }
        }
              MyDriver.getDriver().switchTo().window(instagramPg);
    }

         public void currentWindowHandle(){
           String currentWHandle = MyDriver.getDriver().getWindowHandle();
             Assert.assertEquals(currentWHandle, instagram);

         }

         public int numberOfHandles(){
             int instagramHandle = getAllWindowHandles().size();
             return instagramHandle;
         }
         public boolean instagramLogInBtnIsDisabled(){
            boolean no = isElementEnabled(instagramLogInBtn);
            return no;
           // Assert.assertFalse(no);
         }








}
