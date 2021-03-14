## Selectors

---

### Finding elements

findElement vs findElements

---

### Query Selector

````java
By.id()
By.name()
By.className()
By.tagName()
By.link()
By.partialLinkText()
By.cssSelector()
By.xpath()
````

---

#### Select by ID

````html
<button id="submitButton"></button>
````
````java
WebElement element = driver.findElement(By.id("submitButton"));
````

---

#### Select by className

````html
<button class="greenButton"></button>
````
````java
WebElement element = driver.findElement(By.className("greenButton"));
````

---

#### Select by name

````html
<button name="greenButton"></button>
````
````java
WebElement element = driver.findElement(By.name("greenButton"));
````

---

#### Select by cssSelector

Select an element using the CSS selection syntax.
See: https://www.w3schools.com/cssref/css_selectors.asp

````html
<textarea id="textArea"></textarea>
<button data-testid="submit-button"></button>
````
````java
WebElement textarea = driver.findElement(By.cssSelector("#textArea"));
WebElement button = driver.findElement(By.cssSelector("button[data-testid='submit-button']"));
````

---

#### Select by XPath

Select an element using Xpath.
See: https://www.w3schools.com/xml/xpath_syntax.asp

````html
<textarea id="textArea"></textarea>
<button data-testid="submit-button"></button>
````
````java
WebElement textarea = driver.findElement(By.xpath("//textarea[@id='textArea']"));
WebElement button = driver.findElement(By.xpath("//button[@data-testid='submit-button']"));
````



