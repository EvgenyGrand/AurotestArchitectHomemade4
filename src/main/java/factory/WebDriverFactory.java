package factory;

import data.DriverData;
import exception.BrowserNotSupportException;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {



    public WebDriver getDriver(DriverData driverData, MutableCapabilities options) throws BrowserNotSupportException {

        switch (driverData) {
            case CHROME:
                ChromeOptions chromeOptions = new ChromeOptions();
                if (options!=null){
                    chromeOptions.merge(options);
                }
                return new ChromeDriver();

            default:
                throw new BrowserNotSupportException(driverData);
        }
    }
}
