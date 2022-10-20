package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbsBasePages {

    private String hostname = System.getProperty("base.url");
    private String hostnameTaskSecond = System.getProperty("second.url");

    protected WebDriver driver;

    public AbsBasePages(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void open(){
        driver.get(hostname);
    }
    public void openSecondTask(){
        driver.get(hostnameTaskSecond);
    }
}

