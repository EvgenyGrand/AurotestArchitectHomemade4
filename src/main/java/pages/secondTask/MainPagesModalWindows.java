package pages.secondTask;

import components.modalwindow.ModalWindow;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.abspages.AbsBasePages;

import java.util.List;

public class MainPagesModalWindows extends ModalWindow {

    public MainPagesModalWindows(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type='search'][placeholder='Search here...']")
    private WebElement scroll;


    @FindBy(css="li[data-type*='cat'] .image-zoom")
    private List<WebElement>pictures;


    public void openModalWindow() throws InterruptedException {
        driver.manage().window().maximize();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", pictures.get(4));


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


