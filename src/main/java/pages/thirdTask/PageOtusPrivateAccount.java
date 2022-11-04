package pages.thirdTask;

import components.InputCredsPrivateAccount;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.abspages.AbsBasePages;

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
        explicitWait(login,5);
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
