package be.demo.twitter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class TwitterPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public TwitterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 1);
    }

    public ExpectedCondition<WebElement> isLoaded() {
        return presenceOfElementLocated(Elements.TWEET_AREA.selector);
    }


    public void typeTweet(String content) {
        driver.findElement(Elements.TWEET_AREA.selector).sendKeys(content);
    }

    public void submitTweet() {
        final WebElement tweetButton = driver.findElement(Elements.TWEET_BUTTON.selector);
        wait.until(ExpectedConditions.visibilityOf(tweetButton));
        tweetButton.click();
    }

    enum Elements {
        TWEET_BUTTON(By.cssSelector("div[data-testid='tweetButtonInline']")),
        TWEET_AREA(By.cssSelector("div[data-testid='tweetTextarea_0']"));

        By selector;

        Elements(By selector) {
            this.selector = selector;
        }
    }
}
