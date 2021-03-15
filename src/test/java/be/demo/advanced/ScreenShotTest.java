package be.demo.advanced;

import be.demo.base.SeleniumBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

public class ScreenShotTest extends SeleniumBase {


    @Test
    void takeAScreenShot() throws IOException {
        // Arrange
        driver.get(BASE_URL);
        Path destination = Path.of(System.getProperty("user.dir") + "/screenshot.png");

        // Act

        // TODO: Take a screenshot and save it in the destination as defined above.

        // Assert
        assertThat(Files.deleteIfExists(destination)).isTrue();
    }
}
