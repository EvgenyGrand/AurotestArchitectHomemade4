package components.modalwindow;

import org.openqa.selenium.WebDriver;
import pages.abspages.AbsBasePages;

public abstract class ModalWindow extends AbsBasePages implements IModal {

    public ModalWindow(WebDriver driver) {
        super(driver);
    }
}
