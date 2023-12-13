import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Papierowe {



    public static void main(String[] args) throws MalformedURLException {

      //  File app = new File("src/test/resources/apps/android-build-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
       // capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "PAX A80");


        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub/"), capabilities);
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

        driver.findElementByAccessibilityId("Usługi").click();
     //   driver.findElementByAccessibilityId("Bilety papierowe").click();


        //symulacja tapniecia w ekran dla wybranej pozycji
        int x = 230;
        int y = 230;

        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(x, y)).perform();



        //driver.findElementByXPath("//android.view.View.VirtualChild[@content-desc=\"Bilety papierowe\"]").click();

        driver.findElementByAccessibilityId("Inne bilety").click();
        driver.findElementByAccessibilityId("Gmina Wrocław").click();

//        int screenWidth = driver.manage().window().getSize().width;
//        int screenHeight = driver.manage().window().getSize().height;
//
//
//        // Wykonaj gest przewinięcia w dół
//
//        int scrollDistance = screenHeight; // Przewiń ekran o wysokość ekranu
//        Duration scrollDuration = Duration.ofMillis(1000); // Czas przewijania
//
//// Wykonaj gest przewinięcia w dół o całą wysokość ekranu
//        TouchAction<?> action = new TouchAction<>(driver);
//        action.press(PointOption.point(screenWidth / 2, screenHeight * 2 / 3))
//                .waitAction(WaitOptions.waitOptions(scrollDuration))
//                .moveTo(PointOption.point(screenWidth / 2, screenHeight * 3 / 4))
//                .release()
//                .perform();

                // obsługa tap and swipe
        int xOffset = 255;
        int yOffsetStart = 520; // Pozycja początkowa przesunięcia
        int yOffsetEnd = 200;   // Pozycja końcowa przesunięcia

        touchAction.press(PointOption.point(xOffset, yOffsetStart))
                .moveTo(PointOption.point(xOffset, yOffsetEnd))
                .release().perform();

        driver.findElementByAccessibilityId("DO 1R 8zl").click();
        driver.findElementByAccessibilityId("Wybierz").click();
        driver.findElementByXPath("//android.view.View.VirtualChild[4]").click();
        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.findElementByAccessibilityId("Dalej").click();
        driver.findElementByAccessibilityId("Drukuj").click();


    }
}