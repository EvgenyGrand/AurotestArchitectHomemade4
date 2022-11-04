package pages.firstTask;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.abspages.AbsBasePages;

import java.util.List;

public class SearchPagesDdgOtus extends AbsBasePages {
    public SearchPagesDdgOtus(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "h2 span")
    private List<WebElement> titleOtus;
    public void checkRecord(int index){
        Assertions.assertEquals("Онлайн‑курсы для профессионалов, дистанционное обучение современным ...",titleOtus.get(--index).getText());
    }
}