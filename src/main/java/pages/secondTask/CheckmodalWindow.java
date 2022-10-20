package pages.secondTask;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckmodalWindow extends PicturePageSecondTask {
    public CheckmodalWindow(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div[class=\"pp_pic_holder light_rounded\"]")
    private WebElement modalPicture;

    public void checkModalWindow() {
        WebDriverWait wait = new WebDriverWait(driver, (5));
        wait.until(ExpectedConditions.visibilityOf(modalPicture));
        Assertions.assertTrue(modalPicture.isDisplayed());
    }
}
