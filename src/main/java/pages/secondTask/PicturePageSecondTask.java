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

    @FindBy(css="body > section.w3-gallery.py-5 > div > ul.portfolio-area.clearfix.p-0.m-0 > li:nth-child(4) > span > a > div.content-overlay")
    private WebElement picture;


    public void openModalWindow() throws InterruptedException {

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", picture);
        WebDriverWait wait = new WebDriverWait(driver, (5));
        wait.until(ExpectedConditions.visibilityOf(picture));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click", picture);




    }

}
