package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPages extends AbsBasePages{

    public MainPages(WebDriver driver) {
        super(driver);

        PageFactory.initElements(driver, this);
    }
}
