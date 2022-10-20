package pages.secondTask;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AbsBasePages;

import java.time.Duration;

public class PicturePageSecondTask extends AbsBasePages {

    public PicturePageSecondTask(WebDriver driver) {
        super(driver);
    }
    @FindBy(css="input[type='search'][placeholder='Search here...']")
    private WebElement scroll;

    @FindBy(css="img[src='assets/images/p5.jpg']")
    private WebElement picture;

//    @FindBy(css="div[class=\"pp_pic_holder light_rounded\"]")
//    private WebElement modalPicture;

    public void openModalWindow() throws InterruptedException {
        driver.manage().window().maximize();
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", picture);
        picture.click();


    }

}
