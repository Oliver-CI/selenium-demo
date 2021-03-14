package be.demo.advanced;

import be.demo.base.SeleniumBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.remote.Augmenter;

import static org.assertj.core.api.Assertions.assertThat;

public class StateTest extends SeleniumBase {

    @BeforeEach
    void setUp() {
        driver.get(BASE_URL);
        driver.manage().deleteAllCookies();
        WebStorage storage = (WebStorage) new Augmenter().augment(driver);
        storage.getLocalStorage().clear();
        storage.getSessionStorage().clear();
    }

    @Test
    void cookies() {
        // Arrange
        Cookie cookie = new Cookie("foo", "bar");

        // Act
        driver.manage().addCookie(cookie);

        // Assert
        Cookie driverCookie = driver.manage().getCookieNamed("foo");
        assertThat(driverCookie).isNotNull();
        assertThat(driverCookie.getValue()).isEqualTo("bar");
    }

    @Test
    void sessionStorage() {
        // Arrange
        WebStorage storage = (WebStorage) new Augmenter().augment(driver);

        LocalStorage localStorage = storage.getLocalStorage();
        SessionStorage sessionStorage = storage.getSessionStorage();

        // Act
        localStorage.setItem("LOCAL_KEY", "VALUE");
        sessionStorage.setItem("SESSION_KEY", "VALUE");


        // Assert
        String localStorageItem = localStorage.getItem("LOCAL_KEY");
        assertThat(localStorageItem).isEqualTo("VALUE");

        String sessionStorageItem = sessionStorage.getItem("SESSION_KEY");
        assertThat(localStorageItem).isEqualTo("VALUE");
    }
}
