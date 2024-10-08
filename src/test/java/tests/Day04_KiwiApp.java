package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KiwiPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class Day04_KiwiApp {

    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();
    KiwiPage page=new KiwiPage();


    @Test
    public void kiwiAppTest() throws InterruptedException {
        // uygulamanin yuklendigi dogrulanir
        Assert.assertTrue(driver.isAppInstalled("com.skypicker.main"));
        Thread.sleep(1000);
        // uygulamanin basariyla acildigi dogrulanir
        Assert.assertTrue(page.misafirButonu.isDisplayed());
        // misafir olarak devam et e tiklanir
        page.misafirButonu.click();
        // ardinda gelecek olan 3 adimada yesil butona basilarak devam edilir 542,2043
        Thread.sleep(1000);
        for (int i = 0; i < 3; i++) {
            ReusableMethods.koordinatTiklamaMethodu(542,2043,500);
        }


    }
}
