package homework4;

import data.DriverData;
import exception.BrowserNotSupportException;
import factory.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import pages.MainPages;


import java.util.concurrent.TimeUnit;

public class FirstTaskTest {
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
    public void testCheckDDC(){
        MainPages mainPages = new MainPages(driver);
        mainPages.open();
        mainPages
                .searchOtus("Отус")
                .checkRecord(1);


    }
    @AfterEach
    public void close(){
        driver.quit();
    }

}
