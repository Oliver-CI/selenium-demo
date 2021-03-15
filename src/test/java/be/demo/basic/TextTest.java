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
        final String title = ""; //TODO fill 'title' variable with the title of the page

        // Assert
        assertThat(title).isEqualTo("Demo Selenium");
    }

    @Test
    void getTheContentOfTheHeader() {
        // Arrange
        driver.navigate().to(BASE_URL);

        // Act
        final String header = ""; //TODO fill 'header' variable with the text content of the header

        // Assert
        assertThat(header).isEqualTo("Hello Class");
    }
}
