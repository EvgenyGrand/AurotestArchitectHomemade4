package pages.secondTask;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    @FindBy(css="a[href=\\\"assets/images/p4.jpg\\\"] > div[class='content-overlay']")
    private WebElement picture;

    public void openModalWindow(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", picture);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(picture));
        picture.click();

    }

}
