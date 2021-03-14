## Webdriver Decorators

Used to add more complex functionality to the Webdriver

- Actions
- EventListener

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



