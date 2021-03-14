## Webdriver Decorators & Interface

Used to unlock more complex functionality to the Webdriver

- Actions (Decorator)
- EventListener (Decorator)
- Screenshots (Interface)

--- 

### Actions Decorator

```java
final Actions actions = new Actions(driver);
actions.moveToElement(driver.findElement(By.id("home")));
actions.moveByOffset(-10,-20);
```

Allows the use of more complex functionality such as:
- Drag/Drop
- Click&Hold
- Move Mouse

---

### Event Decorator

```java
final EventFiringWebDriver eventFiringDriver = new EventFiringWebDriver(driver);
// Requires a WebDriverEventListener instance
eventFiringDriver.register(new MyListener()); 

public class MyListener extends AbstractWebDriverEventListener {    
    // Override any methods you want to react on.
    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        // Do something with the element or driver :-)
    }
}

```

Allows you to intercept whenever an action is happening.

--- 

### Taking Screenshots

*Most* Webdrivers implement the TakesScreenshot-interface.
This means we could cast them to that interface and use it to create a screenshot.

```java
File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

// Read it from default location
String absolutePath = screenshot.getAbsolutePath();

// Copy it to somewhere else.
Path destination = Path.of("c:/temp/screenshot" + System.currentTimeMillis() + ".png");
Files.copy(screenshot.toPath(), destination);
```

---



