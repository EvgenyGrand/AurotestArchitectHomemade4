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
import pages.secondTask.CheckmodalWindow;
import pages.secondTask.PicturePageSecondTask;

public class SecondTaskTest {
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
    public void testOpenModalWindow() throws InterruptedException {
        PicturePageSecondTask picturePageSecondTask = new PicturePageSecondTask(driver);
        CheckmodalWindow checkmodalWindow = new CheckmodalWindow(driver);
        picturePageSecondTask.openSecondTask();
            picturePageSecondTask.openModalWindow();
            checkmodalWindow.checkModalWindow();




    }
//    @AfterEach
//    public void close() {
//        if(this.driver != null) {
//            this.driver.close();
//            this.driver.quit();
//        }
//
//    }
}
