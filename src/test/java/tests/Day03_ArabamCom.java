package tests;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Day03_ArabamCom {

    AndroidDriver<AndroidElement> driver;

    @BeforeTest
   public void setUp()throws MalformedURLException{

           // kullanici gerekli kurulumlari yapar
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"PIXEL 4"); // cihazin ismi
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android"); // cihazin ios android neyse
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0"); // cihazin isletim sistemi
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2"); // cihazin otomasyonu
        //cap.setCapability(MobileCapabilityType.APP,"/Users/erolkahraman/IdeaProjects/Team141_Appium_Practice/Apps/arabam.com_5.1.6_Apkpure.apk");
        cap.setCapability("appPackage","com.dogan.arabam");

        // AppPackage uzerinde caliscak oldugumuz uygulamanin kimlik bilgisidir. Apk infodan kimlik bilgisi bulunur
        cap.setCapability("appActivity","com.dogan.arabam.presentation.feature.home.HomeActivity");

        // AppActivity ise uzerinde calisacak oldugumuz uygulamanin hangi sayfasindan baslamak istedigimizi belir
        // yani profil kismindan baslamak istiyorsam ilgili activity bulunur ve appActivity bolumune
        // yazilarak uygulama oradan baslatilir

          driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
          driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }


   @Test
   public void arabamTest1(){


   }

}
