package be.demo.basic;

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

        final WebElement button = driver.findElement(By.tagName("button"));
        WebDriverWait wait = new WebDriverWait(driver, 1);

        // Act
        wait.until(ExpectedConditions.visibilityOf(button));
        button.click();
        final List<WebElement> buttonsBetween = driver.findElements(By.tagName("button"));

        wait.until(ExpectedConditions.invisibilityOf(button));
        final List<WebElement> buttonsEnd = driver.findElements(By.tagName("button"));

        // Assert
        assertThat(buttonsBetween.size()).isEqualTo(buttonsStart.size());
        assertThat(buttonsEnd.size()).isEqualTo(buttonsStart.size() - 1);
    }

    @Test
    void removeAllButtons() {
        // Arrange
        driver.navigate().to(BASE_URL + "/buttons.html");

        final List<WebElement> buttons = driver.findElements(By.tagName("button"));
        WebDriverWait wait = new WebDriverWait(driver, 1);

        // Act
        buttons.forEach(b -> {
            wait.until(ExpectedConditions.visibilityOf(b));
            b.click();
            wait.until(ExpectedConditions.invisibilityOf(b));
        });

        // Assert
        assertThat(driver.findElements(By.tagName("button"))).isEmpty();
    }
}
