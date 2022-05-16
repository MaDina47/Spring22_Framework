package Tests.Instagram;

import Pages.Instagram.Instagram_Methods;
import Web.MyDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class InstagramTestHW5 {
    /**
     * facebook.com/
     * Launch facebook.com
     * Click on Facebook Pay, Oculus, Instagram, Portal and Bulletin
     * Close ALL windows except Instagram
     * Verify number of window-Handles is 1
     * Verify Page Title is Instagram
     * Verify Log in button on Instagram is disabled by default
     */
    @Test
    public void multipleWindowHandles(){
        MyDriver.launchUrlOnNewWindow("https://www.facebook.com");
        Instagram_Methods hw5 = new Instagram_Methods();

        hw5.clickMultipleTabs();
       // System.out.println(hw5.getMultipleHandles());
        hw5.closeTabs();
        //System.out.println(hw5.getCurrentWindowHandle());
        hw5.getCurrentWindowHandle();

        //System.out.println(hw5.instagramLogInBtnIsDisabled());
        Assert.assertFalse(hw5.instagramLogInBtnIsDisabled(),"is enabled");
        Assert.assertEquals(hw5.numberOfHandles(),1, "test failed");
       // System.out.println(hw5.pageTitle());
        Assert.assertEquals(hw5.pageTitle(),"Instagram","Test Failed");


    }

}
