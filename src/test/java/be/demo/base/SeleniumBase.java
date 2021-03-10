package be.demo.base;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumBase {

    public static final String BASE_URL = "http://localhost:3000";
    protected static WebDriver driver;

    public SeleniumBase() {
        this.configureDriver();
    }

    private void configureDriver() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
