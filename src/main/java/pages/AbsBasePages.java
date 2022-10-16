package pages;

import org.openqa.selenium.WebDriver;

public abstract class AbsBasePages {

    private String hostname = System.getProperty("base.url");

    protected WebDriver driver;

    public AbsBasePages(WebDriver driver){
        this.driver=driver;
    }
    public void open(){
        driver.get(hostname);
    }
}
