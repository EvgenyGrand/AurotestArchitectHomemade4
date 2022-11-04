package pages.thirdTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.abspages.AbsBasePages;

public class MainPageOtus extends AbsBasePages {
    public MainPageOtus(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "span.header2__auth-reg")
    private WebElement registrationButton;

    public void clickRegistrationButton()  {
        registrationButton.click();

    }


}
