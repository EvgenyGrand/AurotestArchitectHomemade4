package pages.firstTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.abspages.AbsBasePages;

public class MainPagesDdg extends AbsBasePages {

    public MainPagesDdg(WebDriver driver) {
        super(driver);


    }

    @FindBy(id = "search_form_input_homepage")
    private WebElement inputwindow;

    @FindBy(id = "search_button_homepage")
    private WebElement searchbutton;



    public SearchPagesDdgOtus searchOtus(String request) {
        inputwindow.sendKeys(request);
        searchbutton.click();
        return new SearchPagesDdgOtus(driver);


    }

}