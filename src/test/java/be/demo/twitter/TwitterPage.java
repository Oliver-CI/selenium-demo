package be.demo.twitter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class TwitterPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public TwitterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 1);
    }

    public ExpectedCondition<WebElement> isLoaded() {
        // TODO: Expectation: Tweet Button (button) Element is present.
        return null;
    }

    public void typeTweet(String content) {
        // TODO: Type the 'content' in the Tweet Text Area
    }

    public void submitTweet() {
        // TODO: Click the tweet button
    }
}
