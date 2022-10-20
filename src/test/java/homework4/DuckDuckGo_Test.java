package homework4;

import data.DriverData;
import exception.BrowserNotSupportException;
import factory.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPages;


import java.util.concurrent.TimeUnit;

public class DuckDuckGo_Test {
    private WebDriver driver;

    @BeforeAll
    public static void init(){
        WebDriverManager.chromedriver().setup();

    }
    @BeforeEach
    public  void initDriver() throws BrowserNotSupportException {

        driver = new WebDriverFactory().getDriver(DriverData.CHROME, null);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void testCheckDDC(){
        MainPages mainPages = new MainPages(driver);
        mainPages.open();
        mainPages
                .searchOtus("Отус")
                .checkRecord(1);
       

    }

}
