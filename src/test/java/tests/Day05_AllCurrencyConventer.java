package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;
import pages.AllCurrencyConventerPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;
import java.io.IOException;

public class Day05_AllCurrencyConventer {


    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();
    AllCurrencyConventerPage page=new AllCurrencyConventerPage();

    @Test
    public void currencyTest() throws IOException, IOException {

        // cevirmek istedigimiz para birimi zloty olarak secilir
        page.birinciMenu.click();
        ReusableMethods.scrollWithUiScrollableAndClick("PLN");
        // cevirelecek olan para birimi Tl olarak secilir
        page.ikinciMenu.click();
        ReusableMethods.scrollWithUiScrollableAndClick("Turkish Lira");
        // cevrilen tutar screenShot olarak kaydedilir
        page.bir.click();
        page.ucSifir.click();
        File ekranfotografi= driver.getScreenshotAs(OutputType.FILE);  //ekran goruntusu alıp kaydediyor
        FileUtils.copyFile(ekranfotografi,new File("t141.png"));
        ReusableMethods.getScreenshot("methodlu");

        // Ardindan zloty nin tl karsiligi olan tl degeri kaydedilir
        String sonuc=page.resultExchange.getText();
        // kullaniciya sms olarak bildirilir
        driver.sendSMS("555555555555","zlotynin tl karsiligi= "+sonuc);


    }
}
