package be.demo.basic;

import be.demo.base.SeleniumBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

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

    @Test
    void fillInAndSubmitFormtopia() {
        // Arrange
        driver.navigate().to(BASE_URL + "/formtopia.html");
        // Act
        final List<WebElement> inputs = driver.findElements(By.tagName("input"));
        inputs.stream()
                .filter(i -> i.getAttribute("required") != null)
                .forEach(this::fillInInput);

        final WebElement submitButton = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
        submitButton.click();

        // Assert
        assertThat(driver.getCurrentUrl()).containsIgnoringCase("Victory");
        final WebElement h1 = driver.findElement(By.tagName("h1"));
        assertThat(h1.getText()).isEqualTo("Victory!!");
    }

    private void fillInInput(final WebElement input) {
        final String type = input.getAttribute("type");
        switch (type) {
            case "text":
                input.sendKeys("some text");
                break;
            case "number":
                input.sendKeys("666");
                break;
            case "email":
                input.sendKeys("selenium@example.com");
                break;
            case "date":
                final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                input.sendKeys(LocalDate.now().format(formatter));
                break;
            default:
                throw new IllegalArgumentException("No handler for type" + type);
        }
    }

}
