package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbsBasePages {

    private String hostname = System.getProperty("base.url");
    private String hostnameTaskSecond = System.getProperty("second.url");
    private String hostnameTaskThree = System.getProperty("third.url");
    private String login = System.getProperty("login");
    private String password = System.getProperty("password");

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
    public void openThirdTask(){
        driver.get(hostnameTaskThree);
    }
    public CharSequence inputLogin(){
        System.getProperty(login);
        return login;
    }
    public CharSequence inputPassword(){
        System.getProperty(password);
        return password;
    }

}

