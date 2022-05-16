package Pages.Darksky;

import Pages.Commands;
import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HW5Pages extends Commands {

    // T1 TimeMachine Button
    By timeMachinelc = By.xpath("//div[@class= 'buttonContainer']//a[@class='button']");
    By currentDay = By.xpath("//td[@class='is-today']");

    //T2 Same temp values

    By todayLocator = By.xpath("//*[contains(text(), 'Today')]");
    By minTemp = By.xpath("(//span[@class='minTemp'])[1]");
    By maxTemp = By.xpath("(//span[@class='maxTemp'])[1]");
    By minTempToCompare = By.xpath("(//span[@class='highTemp swip'])[1]");
    By maxTempToCompare = By.xpath("(//span[@class='lowTemp swap'])[1]");

    public void findElTimeMachine(){
       findWebElement(timeMachinelc);
   }

    public void timeMachineClick() { findWebElement(timeMachinelc).click();}

    public void scrollToTimeMachineBtnByPixel(){ scrollByPixel();}

    public String getAttributeOfCurrentDate(){
        String date = findWebElement(currentDay).getAttribute("data-day");
        return date;
    }
     public String todayDate(){
         Date td = new Date();
         SimpleDateFormat sdf = new SimpleDateFormat("d");
         String currentDay1 = sdf.format(td);
        // System.out.println(currentDay1);
         return currentDay1;
     }

   // 2
    public void scrollToTodayBarByPixel(){ scrollByPixel();}

    public void todayClick() {
        findWebElement(todayLocator).click();}

    public String getMinTempText(){
        String[] minT = getTextOfWebElement(minTemp).split("˚");
       // String minTemp  = minT[0];
        return minT[0];
    }
    public String getMaxTempText(){
        String[] maxT = getTextOfWebElement(maxTemp).split("˚");
       // String maxTemp  = maxT[0];
        return maxT[0];
    }

    public String getMinTpTextToCompare(){
        String[] minTp = getTextOfWebElement(minTempToCompare).split("˚");
        return minTp[0];
    }
    public String getMaxTpTextToCompare(){
        String[] maxTp = getTextOfWebElement(maxTempToCompare).split("˚");
        return maxTp[0];
    }
//    public boolean isMinTepmValuesAreTheSame(){
//        boolean theSameTemp = minTemp==maxTemp;
//        return theSameTemp;
//    }












}
