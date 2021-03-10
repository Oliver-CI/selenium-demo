package be.demo.base;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumBase {

    public static final String BASE_URL = "http://localhost:3000";
    //    public static final String BASE_URL = "http://172.19.44.147:3000";
    protected static WebDriver driver;

    public SeleniumBase() {
        this.configureDriver();
    }


    private void configureDriver() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }

    /*
    private void configureDriver() {
        ChromeOptions options = new ChromeOptions();
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }*/

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
