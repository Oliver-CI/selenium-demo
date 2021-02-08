package be.demo;

import be.demo.base.SeleniumBase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TextTest extends SeleniumBase {

    @Test
    void getTheTitleOfThePage() {
        // Arrange
        driver.navigate().to("http://host.docker.internal:3000");

        // Act
        final String title = driver.getTitle();

        // Assert
        assertThat(title).isEqualTo("Demo Selenium");
    }
}
