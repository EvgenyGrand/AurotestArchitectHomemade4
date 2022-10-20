package pages.ThirdTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbsBasePages;

public class CookiePage extends AbsBasePages {
    public CookiePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@class = 'header2__auth js-open-modal']")
    private WebElement registrationButton;

    public void clickRegistrationButton() throws InterruptedException {
        registrationButton.click();

    }

//    @FindBy(css = "input[type='text'][placeholder='Электронная почта']")
//    private WebElement login;
//
//    @FindBy(css = "input[type='password']")
//    private WebElement password;
//
//    @FindBy(css = "button[class='new-button new-button_full new-button_blue new-button_md']")
//    private WebElement buttonLK;
}
