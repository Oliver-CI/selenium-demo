## Flexibility and encapsulation

Page objects themselves should never make verifications or assertions.

There is one, single, verification which can, and should, be within the page object and that is to verify that the page,
and possibly critical elements on the page, were loaded correctly.

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
