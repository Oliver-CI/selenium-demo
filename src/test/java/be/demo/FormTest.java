package be.demo;

import be.demo.base.SeleniumBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;

public class FormTest extends SeleniumBase {
    @Test
    void fillInAndSubmitForm() {
        // Arrange
        driver.navigate().to(BASE_URL + "/form.html");
        // Act
        final WebElement content = driver.findElement(By.id("content"));
        content.sendKeys("my super special content");

        final WebElement submitButton = driver.findElement(By.id("submit_button"));
        submitButton.click();

        // Assert
        assertThat(driver.getCurrentUrl()).containsIgnoringCase("Victory");
        final WebElement h1 = driver.findElement(By.tagName("h1"));
        assertThat(h1.getText()).isEqualTo("Victory!!");
    }
}
