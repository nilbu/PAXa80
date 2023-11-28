package Papierowe;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup {

        public AndroidDriver driver;

        @BeforeMethod
        public void setupAppium() throws MalformedURLException {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "PAX A80");
            this.driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub/"), capabilities);
            this.driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        }
    }


