package pages.abspages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.LogManager;

public abstract class AbsBasePages {

    private String hostname = System.getProperty("base.url");
    private String hostnameTaskSecond = System.getProperty("second.url");
    private String hostnameTaskThree = System.getProperty("third.url");



    protected WebDriver driver;
    protected WebDriverWait wait;


    public AbsBasePages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void open() {
        driver.get(hostname);
    }

    public void openSecondTask() {
        driver.get(hostnameTaskSecond);
    }

    public void openThirdTask() {
        driver.get(hostnameTaskThree);
    }

    public void explicitWait( int time, ExpectedCondition condition) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(condition);

    }
}

