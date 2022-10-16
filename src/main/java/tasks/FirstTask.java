package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbsBasePages;
import pages.MainPages;

import java.util.Collections;
import java.util.List;

public class FirstTask extends MainPages {
    public FirstTask(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "search_form_input_homepag")
    private WebElement inputwindow;

    @FindBy(css = "search_button_homepage")
    private WebElement searchbutton;

    @FindBy(css = "span[class='EKtkFWMYpwzMKOYr0GYm LQVY1Jpkk8nyJ6HBWKAk']")
    private WebElement titleOtus;

    public void searchOtus() throws InterruptedException {
        driver.get("https://duckduckgo.com/");
        inputwindow.sendKeys("ОТУС");
        searchbutton.click();
        List<WebElement> searchResult = Collections.singletonList(titleOtus);


    }
}