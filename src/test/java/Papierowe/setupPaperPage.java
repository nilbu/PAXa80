package Papierowe;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class setupPaperPage{
    private AndroidDriver driver;

    private String Uslugi = "Usługi";
    private String BiletyPapierowe = "Bilety papierowe";
    private String InneBilety = "Inne bilety";
    private String GminaWroclaw = "Gmina Wrocław";

    private String Wybierz = "Wybierz";
    private String PoleNr = "//android.view.View.VirtualChild[4]";
    private String Dalej = "Dalej";
    private String Drukuj = "Drukuj";
    private String Wydrukuj = "Wydrukuj";


    public  setupPaperPage (AndroidDriver driver){
        this.driver = driver;
    }

    public void Scroll(){

        int screenWidth = driver.manage().window().getSize().width;
        int screenHeight = driver.manage().window().getSize().height;


        // Wykonaj gest przewinięcia w dół


        Duration scrollDuration = Duration.ofMillis(1000); // Czas przewijania

// Wykonaj gest przewinięcia w dół o całą wysokość ekranu
        TouchAction<?> action = new TouchAction<>(driver);
        action.press(PointOption.point(screenWidth / 2, screenHeight * 2 / 3))
                .waitAction(WaitOptions.waitOptions(scrollDuration))
                .moveTo(PointOption.point(screenWidth / 2, screenHeight * 3 / 4))
                .release()
                .perform();
    }

    public void tap(int x, int y) {

        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(x, y)).perform();
    }

    public void Enterpaper() {

        driver.findElementByAccessibilityId(Uslugi).click();
        tap(230, 230);
       // driver.findElementByAccessibilityId(BiletyPapierowe).click();
        driver.findElementByAccessibilityId(InneBilety).click();
        driver.findElementByAccessibilityId(GminaWroclaw).click();
    }

    public void EnterpaperWithScroll() {

        driver.findElementByAccessibilityId(Uslugi).click();
        driver.findElementByAccessibilityId(BiletyPapierowe).click();
        driver.findElementByAccessibilityId(InneBilety).click();
        driver.findElementByAccessibilityId(GminaWroclaw).click();

    }

    public void Ticket(String ticket){
        driver.findElementByAccessibilityId(ticket).click();

    }

    public void AfterPaper() {
        driver.findElementByAccessibilityId(Wybierz).click();
        driver.findElementByXPath(PoleNr).click();
        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.findElementByAccessibilityId(Dalej).click();
        driver.findElementByAccessibilityId(Drukuj).click();
        driver.findElementByAccessibilityId(Wydrukuj).click();

    }
}
