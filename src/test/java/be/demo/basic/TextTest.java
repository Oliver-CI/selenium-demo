package be.demo.basic;

import be.demo.base.SeleniumBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;


public class TextTest extends SeleniumBase {

    @Test
    void getTheTitleOfThePage() {
        // Arrange
        driver.navigate().to(BASE_URL);

        // Act
        final String title = driver.getTitle();

        // Assert
        assertThat(title).isEqualTo("Demo Selenium");
    }

    @Test
    void getTheContentOfTheHeader() {
        // Arrange
        driver.navigate().to(BASE_URL);

        // Act
        final String title = driver.findElement(By.cssSelector("h1")).getText();

        // Assert
        assertThat(title).isEqualTo("Hello Class");
    }
}
