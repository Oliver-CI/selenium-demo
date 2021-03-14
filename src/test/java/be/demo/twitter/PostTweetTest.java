package be.demo.twitter;

import be.demo.base.SeleniumBase;
import org.junit.jupiter.api.Test;

public class PostTweetTest extends SeleniumBase {

    @Test
    public void canTypeTweet() {
        // Get password from environment variable, not sharing it in public code :p
        final String password = System.getenv("XPASS");

        // Login
        TwitterLoginPage login = new TwitterLoginPage(driver);
        login.navigateTo();
        wait(5).until(login.isLoaded());
        login.login("TCoolsIT",password );

        // Type and Submit Tweet
        TwitterPage mainPage = new TwitterPage(driver);
        wait(5).until(mainPage.isLoaded());
        mainPage.typeTweet("Hello from AP Hogeschool!");
        //mainPage.submitTweet(); --> uncomment to actually submit

        // Manual validation
    }
}
