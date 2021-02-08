package be.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumDriver {
    private WebDriver driver;

    public SeleniumDriver() {
        this.configureDriver();
    }

    private void configureDriver() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }

    public void navigateTo(final String url) {
        driver.navigate().to(url);
    }

    public void endSession() {
        this.driver.quit();
    }
}
