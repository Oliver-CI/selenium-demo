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

    @FindBy(css = "div[data-testid='tweetButtonInline']")
    private WebElement tweetButton;

    @FindBy(css = "div[data-testid='tweetTextarea_0']")
    private WebElement tweetArea;

    private final WebDriver driver;
    private final WebDriverWait wait;

    public TwitterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 1);
        PageFactory.initElements(driver, this);

        final EventFiringWebDriver eventFiringDriver = new EventFiringWebDriver(driver);
        eventFiringDriver.register(new AbstractWebDriverEventListener() {
            @Override
            public void beforeClickOn(WebElement element, WebDriver driver) {
                // Do something with the element or driver :-)
            }
        });
    }

    public ExpectedCondition<WebElement> isLoaded() {
        return visibilityOf(tweetButton);
    }

    public void typeTweet(String content) {
        tweetArea.sendKeys(content);
    }

    public void submitTweet() {
        tweetButton.click();
    }
}
