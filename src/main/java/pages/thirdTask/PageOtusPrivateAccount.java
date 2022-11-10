package pages.thirdTask;

import components.creds.InputCredsPrivateAccount;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PageOtusPrivateAccount extends InputCredsPrivateAccount {
    public PageOtusPrivateAccount(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "input[type='text'][placeholder='Электронная почта']")
   private WebElement login;

   @FindBy(css = "input[type='password']")
   private WebElement password;

    @FindBy(css = "button[class$='new-button_md'][type='submit']")
   private WebElement buttonLK;

    public void inputCreds(){
        explicitWait(5, ExpectedConditions.visibilityOf(login));
        login.clear();
        login.sendKeys(inputLogin());
        password.clear();
        password.sendKeys(inputPassword());
        buttonLK.click();
    }
    public void getCookieInConsole(){
        System.out.println(driver.manage().getCookies());
    }


}
