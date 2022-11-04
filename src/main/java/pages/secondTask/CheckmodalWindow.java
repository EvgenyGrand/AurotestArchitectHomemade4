package pages.secondTask;

import components.ModalWindow;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckmodalWindow extends ModalWindow {

    public CheckmodalWindow(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.pp_pic_holder.light_rounded")
    private WebElement modalPicture;

    public void checkModalWindow() {
        explicitWait(modalPicture, 5);
        Assertions.assertTrue(modalPicture.isDisplayed());
    }
}

