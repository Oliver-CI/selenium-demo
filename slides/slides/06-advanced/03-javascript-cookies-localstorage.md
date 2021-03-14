## Browser Interaction

- Cookies
- Accessing Local Storage
- Executing Javascript

---

### Cookies

```java
Cookie cookie = new Cookie("foo", "bar");
driver.manage().addCookie(cookie);

Cookie driverCookie = driver.manage().getCookieNamed("foo");
```

---

### Accessing LocalStorage/SessionStorage

```java
Webstorage storage = (WebStorage)new Augmenter().augment(driver);

// Select a type of storage
LocalStorage localStorage = storage.getLocalStorage();
SessionStorage sessionStorage = storage.getSessionStorage();

// Use the storage
String item = localStorage.getItem("KEY");
localStorage.setItem("KEY", "VALUE");
```

---

### Execute Javascript from Selenium

```java
//Creating the JavascriptExecutor interface object by Type casting		
JavascriptExecutor js = (JavascriptExecutor)driver;	

js.executeScript("alert('Hello from Selenium :-)');");   
