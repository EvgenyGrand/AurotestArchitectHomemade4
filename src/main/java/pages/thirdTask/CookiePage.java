package pages.thirdTask;

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


}
