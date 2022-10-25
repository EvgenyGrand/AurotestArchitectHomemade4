package pages.secondTask;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.function.BooleanSupplier;

public class CheckmodalWindow extends PicturePageSecondTask {

    public CheckmodalWindow(WebDriver driver) {
        super(driver);
    }

    //Код для поиска всех картинок, и получения по поиску первой картинки не сработает,
    // так как в модальном окне открывается только одна картинка, и именно ее нам нужно проверить на то,
    // что она открылась в модальном окне.
    //Соответственно, старый код считаю верным


//    @FindBy(css = "body > section.w3-gallery.py-5 > div")
//    private WebElement modalPicture;
//    List<WebElement> modalPictures;

//    public void checkModalWindow(int index) {
//        WebDriverWait wait = new WebDriverWait(driver, (5));
//        wait.until(ExpectedConditions.visibilityOf(modalPicture));
//        Assertions.assertTrue(modalPictures.get(index).isDisplayed());
//    }

    @FindBy(css = "div[class*=\"pp_pic_holder\"]")
    private WebElement modalPicture;

    public void checkModalWindow() {
        WebDriverWait wait = new WebDriverWait(driver, (5));
        wait.until(ExpectedConditions.visibilityOf(modalPicture));
        Assertions.assertTrue(modalPicture.isDisplayed());
    }
}



