## Conditions

<!-- .slide: class="is-module" -->

---

### Wait

````java

// implicit
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

// explicit
WebDriverWait wait= new WebDriverWait(driver,30);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("myId")));

// fluent
Wait<WebDriver> wait = new FluentWait<>(driver)
.withTimeout(Duration.ofSeconds(2))
.pollingEvery(Duration.ofSeconds(5))
.ignoring(NoSuchElementException.class);

WebElement foo = wait.until(driver -> driver.findElement(By.id("foo")));
````

---

### ExpectedCondition

- alertIsPresent()
- elementSelectionStateToBe()
- elementToBeClickable()
- elementToBeSelected()
- frameToBeAvailableAndSwitchToIt()
- invisibilityOfTheElementLocated()
- invisibilityOfElementWithText()
- presenceOfAllElementsLocatedBy()
- presenceOfElementLocated()
- textToBePresentInElement()
- textToBePresentInElementLocated()
- textToBePresentInElementValue()
- titleIs()
- titleContains()
- visibilityOf()
- visibilityOfAllElements()
- visibilityOfAllElementsLocatedBy()
- visibilityOfElementLocated()
