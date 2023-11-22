package Papierowe;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

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

    public  setupPaperPage (AndroidDriver driver){
        this.driver = driver;
    }

    public void Enterpaper() {
        driver.findElement(By.id(Uslugi)).click();
        driver.findElement(By.id(BiletyPapierowe)).click();
        driver.findElement(By.id(InneBilety)).click();
        driver.findElement(By.id(GminaWroclaw)).click();
    }

    public void Ticket(String ticket){
        driver.findElement(By.id(ticket)).click();

    }

    public void AfterPaper() {
        driver.findElement(By.id(Wybierz)).click();
        driver.findElement(By.id(PoleNr)).click();
        driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.findElement(By.id(Dalej)).click();
        driver.findElement(By.id(Drukuj)).click();
    }
}
