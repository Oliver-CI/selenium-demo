package be.demo.base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumBase {

   protected static WebDriver driver;

    public SeleniumBase() {
        this.configureDriver();
    }

    private void configureDriver() {
        ChromeOptions options = new ChromeOptions();
//        driver = new ChromeDriver(options);
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }
}
