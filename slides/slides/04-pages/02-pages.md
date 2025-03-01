### Page Object Model

https://www.selenium.dev/documentation/en/guidelines_and_recommendations/page_object_models/

---

### Why use POM?

- Encapsulate logic to pages
- Reusability of a page
- The assertions are only present in the tests
- Clean separation between test and page services

---

````java

public class TestLogin {
    
    @Test
    public void testLogin() {
        // fill login data on sign-in page
        driver.findElement(By.name("user_name")).sendKeys("testUser");
        driver.findElement(By.name("password")).sendKeys("my supersecret password");
        driver.findElement(By.name("sign-in")).click();

        // verify h1 tag is "Hello userName" after login
        driver.findElement(By.tagName("h1")).isDisplayed();
        assertThat(driver.findElement(By.tagName("h1")).getText(), is("Hello userName"));
    }

    vs


    @Test
    public void testLogin() {
        SignInPage signInPage = new SignInPage(driver);
        HomePage homePage = signInPage.loginValidUser("userName", "password");
        assertThat(homePage.getMessageText(), is("Hello userName"));
    }

}
````
---
### SignInPage

````java
public class SignInPage {

    private final WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void signInPage(final String userName, final String password){
        // page logic
    }
}

````

---

### Page Factory

````java
public class SignInPage {

  @FindBy(css = ".page-title")
  private WebElement title;

  public SignInPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }
}
````
No more
````java
public class SignInPage {
    ...

    public void signInPage(final String userName, final String password) {
        driver.findElement(By.cssSelector(".page-title"));
    }
}
````
