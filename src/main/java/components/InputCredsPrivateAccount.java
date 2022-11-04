package components;

import org.openqa.selenium.WebDriver;
import pages.abspages.AbsBasePages;

public class InputCredsPrivateAccount extends AbsBasePages {

    public InputCredsPrivateAccount(WebDriver driver) {
        super(driver);
    }

    private String login = System.getProperty("login");
    private String password = System.getProperty("password");


    public CharSequence inputLogin() {
        System.getProperty(login);
        return login;


}

    public CharSequence inputPassword() {
        System.getProperty(password);
        return password;
    }
    }