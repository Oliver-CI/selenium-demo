package be.demo;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TwitterSteps {

    @Given("I log in in twitter")
    public void iLogInInTwitter() {
        throw new PendingException();
    }

    @When("I tweet a message with content {string}")
    public void iTweetAMessageWithContent(final String content) {
        throw new PendingException();
    }

    @Then("my message should be visible on my feed")
    public void myMessageShouldBeVisibleOnMyFeed() {
        throw new PendingException();
    }
}
