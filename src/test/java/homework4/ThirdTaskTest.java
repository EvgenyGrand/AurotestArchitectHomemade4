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
import pages.MainPages;
import pages.ThirdTask.CookiePage;
import pages.ThirdTask.ModalWindowThirdTask;

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
    public void testCheckCoocke() throws InterruptedException {
        CookiePage cookiePage = new CookiePage(driver);
        ModalWindowThirdTask modalWindowThirdTask = new ModalWindowThirdTask(driver);
        cookiePage.openThirdTask();
        cookiePage.clickRegistrationButton();
        modalWindowThirdTask.inputCreds();
        modalWindowThirdTask.getCookieInConsole();


    }
//    @AfterEach
//    public void close(){
//        driver.quit();
//    }

}


