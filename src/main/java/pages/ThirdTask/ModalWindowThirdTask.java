package pages.ThirdTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ModalWindowThirdTask extends CookiePage{
    public ModalWindowThirdTask(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type='text'][placeholder='Электронная почта']")
   private WebElement login;

   @FindBy(css = "input[type='password']")
   private WebElement password;

    @FindBy(css = "button[class='new-button new-button_full new-button_blue new-button_md']")
   private WebElement buttonLK;

    public void inputCreds(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(login));
        login.clear();
        login.sendKeys("Evgeny.Grand@mail.ru");
        password.clear();
        password.sendKeys("Lufthansa12");
        buttonLK.click();
    }
    public void getCookieInConsole(){
        System.out.println(driver.manage().getCookies());
    }
}
