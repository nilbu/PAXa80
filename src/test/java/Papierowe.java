import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Papierowe {
    @Test
    public  void test() throws MalformedURLException {

      //  File app = new File("src/test/resources/apps/android-build-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
       // capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "PAX A80");


        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub/"), capabilities);
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

        driver.findElementByAccessibilityId("Usługi").click();
        driver.findElementByAccessibilityId("Bilety papierowe").click();
        driver.findElementByAccessibilityId("Inne bilety").click();
        driver.findElementByAccessibilityId("Gmina Wrocław").click();
        driver.findElementByAccessibilityId("1R nor.MP").click();
        driver.findElementByAccessibilityId("Wybierz").click();
        driver.findElementByXPath("//android.view.View.VirtualChild[4]").click();
        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.findElementByAccessibilityId("Dalej").click();
        driver.findElementByAccessibilityId("Drukuj").click();

        driver.findElementByAccessibilityId("Usługi").click();
        driver.findElementByAccessibilityId("Bilety papierowe").click();
        driver.findElementByAccessibilityId("Inne bilety").click();
        driver.findElementByAccessibilityId("Gmina Wrocław").click();
        driver.findElementByAccessibilityId("1R ulg.MP").click();
        driver.findElementByAccessibilityId("Wybierz").click();
        driver.findElementByXPath("//android.view.View.VirtualChild[4]").click();
        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.findElementByAccessibilityId("Dalej").click();
        driver.findElementByAccessibilityId("Drukuj").click();

    }
}