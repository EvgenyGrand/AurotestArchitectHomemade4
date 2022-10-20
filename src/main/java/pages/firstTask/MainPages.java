package pages.firstTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbsBasePages;

public class MainPages extends AbsBasePages {

    public MainPages(WebDriver driver) {
        super(driver);


    }

    @FindBy(id = "search_form_input_homepage")
    private WebElement inputwindow;

    @FindBy(id = "search_button_homepage")
    private WebElement searchbutton;



    public SearchPages searchOtus(String request) {
        inputwindow.sendKeys(request);
        searchbutton.click();
        return new SearchPages(driver);


    }
}
