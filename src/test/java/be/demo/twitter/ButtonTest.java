package be.demo.twitter;

import be.demo.base.SeleniumBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ButtonTest extends SeleniumBase {

    @Test
    void waitUntilButtonIsRemoved() {
        // Arrange
        driver.navigate().to(BASE_URL + "/buttons.html");

        final List<WebElement> buttonsStart = driver.findElements(By.tagName("button"));

        // Act

        // TODO: Remove a single button from the page.
        // Beware, it might take a moment for them to be gone, so you will have to take that into account.

        // Assert
        final List<WebElement> buttonsEnd = driver.findElements(By.tagName("button"));
        assertThat(buttonsEnd.size()).isEqualTo(buttonsStart.size() - 1);
    }

    @Test
    void removeAllButtons() {
        // Arrange
        driver.navigate().to(BASE_URL + "/buttons.html");

        // ACT
        // TODO: Click all buttons on the page to remove them.
        // Beware, it might take a moment for them to be gone, so you will have to take that into account.

        // Assert
        assertThat(driver.findElements(By.tagName("button"))).isEmpty();
    }
}
