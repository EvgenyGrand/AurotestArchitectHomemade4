package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collections;
import java.util.List;

public class SearchPages extends AbsBasePages {
    public SearchPages(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "span[class='EKtkFWMYpwzMKOYr0GYm LQVY1Jpkk8nyJ6HBWKAk']")
    private List<WebElement> titleOtus;

    public void checkRecord(int index){
        Assertions.assertEquals("Онлайн‑курсы для профессионалов, дистанционное обучение современным ...",titleOtus.get(--index).getText());
    }
}
