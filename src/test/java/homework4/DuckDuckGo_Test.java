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
import tasks.FirstTask;

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
    public void Test_Check_DDC(){
        new FirstTask(driver).open();
       

    }

}
