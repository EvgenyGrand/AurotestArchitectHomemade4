package pages.secondTask;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AbsBasePages;

import java.time.Duration;
import java.util.List;

public class PicturePageSecondTask extends AbsBasePages {

    public PicturePageSecondTask(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type='search'][placeholder='Search here...']")
    private WebElement scroll;

//    @FindBy(css = "a[href='assets/images/p4.jpg'] >div[class='content-overlay']")
//    private WebElement picture;

    @FindBy(css="li[data-type*='cat'] .image-zoom")
    private List<WebElement>pictures;




    public void openModalWindow() throws InterruptedException {
        System.out.println(pictures.size());
        driver.manage().window().maximize();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", pictures.get(4));


    }

}


//public class PicturePageSecondTask extends AbsBasePages {
//
//    public PicturePageSecondTask(WebDriver driver) {
//        super(driver);
//    }
//
//    @FindBy(css = "input[type='search'][placeholder='Search here...']")
//    private WebElement scroll;
//
//    @FindBy(css = "a[href='assets/images/p4.jpg'] >div[class='content-overlay']")
//    private WebElement picture;
//
//
//    public void openModalWindow() throws InterruptedException {
//        driver.manage().window().maximize();
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", picture);
