package pages.secondTask;

import components.modalwindow.ModalWindow;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckmodalWindow extends ModalWindow {

    public CheckmodalWindow(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.pp_pic_holder.light_rounded")
    private WebElement modalPicture;

    public void checkModalWindow() {
        explicitWait(5, ExpectedConditions.visibilityOf(modalPicture));
        Assertions.assertTrue(modalPicture.isDisplayed());
    }


    @Override
    public void modalShouldNotBePresent() {

    }

    @Override
    public void modalShouldNotBeVisible() {

    }

    @Override
    public void modalShouldBeVisible() {

    }
}

