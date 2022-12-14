package homework4;

import data.DriverData;
import exception.BrowserNotSupportException;
import factory.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.thirdTask.MainPageOtus;
import pages.thirdTask.PageOtusPrivateAccount;

public class ThirdTaskTest {
    private WebDriver driver;

    @BeforeAll
    public static void init(){
        WebDriverManager.chromedriver().setup();

    }
    @BeforeEach
    public  void initDriver() throws BrowserNotSupportException {

        driver = new WebDriverFactory().getDriver(DriverData.CHROME, null);

    }

    @Test
    public void testCheckCookie() throws InterruptedException {
        driver.manage().window().maximize();
        MainPageOtus cookiePage = new MainPageOtus(driver);
        PageOtusPrivateAccount modalWindowThirdTask = new PageOtusPrivateAccount(driver);
        cookiePage.openThirdTask();
        cookiePage.clickRegistrationButton();
        modalWindowThirdTask.inputCreds();
        modalWindowThirdTask.getCookieInConsole();


    }
    @AfterEach
    public void close() {
        if (this.driver != null) {
            this.driver.close();
            this.driver.quit();
        }
    }

    }


