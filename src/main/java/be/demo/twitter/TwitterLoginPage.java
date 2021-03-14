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
        return presenceOfElementLocated(Elements.USERNAME_BOX.selector);
    }

    public void navigateTo() {
        driver.get("https://twitter.com/login");
    }

    public void login(String username, String password) {
        driver.findElement(Elements.USERNAME_BOX.selector).sendKeys(username);
        driver.findElement(Elements.PASSWORD_BOX.selector).sendKeys(password);

        final WebElement loginButton = driver.findElement(Elements.LOGIN_BUTTON.selector);
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }


    enum Elements {
        USERNAME_BOX(By.name("session[username_or_email]")),
        PASSWORD_BOX(By.name("session[password]")),
        LOGIN_BUTTON(By.cssSelector("div[data-testid='LoginForm_Login_Button']"));

        By selector;

        Elements(By selector) {
            this.selector = selector;
        }
    }
}
