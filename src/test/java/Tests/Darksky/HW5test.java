package Tests.Darksky;

import Helper.Misc;
import Pages.Darksky.LandingPageHW5;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW5test {
    /**
     * darksky.net
     * Verify the current date is highlighted in Time Machine's calendar
     */
    By timeMachinelc = By.xpath("//div[@class= 'buttonContainer']//a[@class='button']");
    By currentDay = By.xpath("//td[@class='is-today']");

    @Test
    public void isCurrentDateHighlighted (){

        MyDriver.launchUrlOnNewWindow("https://darksky.net/");
        Misc.pause(2);

        LandingPageHW5 hw = new LandingPageHW5();
        hw.scrollToTimeMachineBtnByPixel();
        Misc.pause(5);

        hw.timeMachineClick();
        Misc.pause(3);

        Assert.assertEquals(hw.getAttributeOfCurrentDate(), hw.todayDate(), "test failed");
        MyDriver.quitWindows();
    }

    /**
     * darksky.net
     * Verify same values are displayed in the Today's data
     */

      @Test
      public void verifyIsTempValuesAreTheSame(){
          MyDriver.launchUrlOnNewWindow("https://darksky.net/");
          Misc.pause(2);
          LandingPageHW5 hw = new LandingPageHW5();

          hw.scrollToTodayBarByPixel();
          Misc.pause(5);
          hw.todayClick();
          Misc.pause(3);
//          System.out.println(hw.getMinTempText());
//          System.out.println(hw.getMaxTempText());
//          System.out.println(hw.getMinTpTextToCompare());
//          System.out.println(hw.getMaxTpTextToCompare());

          Assert.assertEquals(hw.getMinTempText(), hw.getMinTpTextToCompare(),"Test failed");
          Assert.assertEquals(hw.getMaxTempText(),hw.getMaxTpTextToCompare(),"Test failed");

          MyDriver.quitWindows();

      }


}
