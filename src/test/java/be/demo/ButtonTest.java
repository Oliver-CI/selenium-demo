package be.demo;

import be.demo.base.SeleniumBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonTest extends SeleniumBase {

    @Test
    void waitUntilButtonIsRemoved() {
        driver.navigate().to("http://host.docker.internal:3000/buttons.html");

        final WebElement button = driver.findElement(By.tagName("button"));
        WebDriverWait wait = new WebDriverWait(driver, 1);


        wait.until(ExpectedConditions.visibilityOf(button));
        button.click();

        wait.until(ExpectedConditions.invisibilityOf(button));
    }
}
