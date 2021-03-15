package be.demo.twitter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class TwitterLoginPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public TwitterLoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 1);
    }

    public ExpectedCondition<WebElement> isLoaded() {
        // Todo: Expectation: Username (textbox) Element is present.
        return null;
    }

    public void navigateTo() {
        // TODO: navigate to https://twitter.com/login
        driver.get("https://twitter.com/login");
    }

    public void login(String username, String password) {
        // TODO fill in user name and click login button
    }
}
