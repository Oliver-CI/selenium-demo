package be.demo.twitter;

import be.demo.base.SeleniumBase;
import org.junit.Test;

public class PostTweetTest extends SeleniumBase {

    @Test
    public void canTypeTweet() {
        // Login
        TwitterLoginPage login = new TwitterLoginPage(driver);
        login.navigateTo();
        wait(5).until(login.isLoaded());
        login.login("TCoolsIT", System.getenv("XPASS"));

        // Type and Submit Tweet
        TwitterPage mainPage = new TwitterPage(driver);
        wait(5).until(mainPage.isLoaded());
        mainPage.typeTweet("Hello from AP Hogeschool!");
        //mainPage.submitTweet(); --> uncomment to actually submit

        // Manual validation
    }
}
