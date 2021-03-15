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

        // TODO: Add a Cookie named "foo" with value "bar"

        // Assert
        Cookie driverCookie = driver.manage().getCookieNamed("foo");
        assertThat(driverCookie).isNotNull();
        assertThat(driverCookie.getValue()).isEqualTo("bar");
    }

    @Test
    void sessionStorage() {

        WebStorage storage = (WebStorage) new Augmenter().augment(driver);

        // TODO Add following entries:
        // In localStorage: "LOCAL_KEY", "VALUE"
        // In SessionStorage: "SESSION_KEY", "VALUE"

        // Assert
        String localStorageItem = storage.getLocalStorage().getItem("LOCAL_KEY");
        assertThat(localStorageItem).isEqualTo("VALUE");

        String sessionStorageItem = storage.getSessionStorage().getItem("SESSION_KEY");
        assertThat(localStorageItem).isEqualTo("VALUE");
    }
}
