# Selenium Demo

This demo would hopefully guide some lost souls to get the hang of using selenium.

## Slides

See: selenium-demo.pdf

## ChromeDriver

Before running anything best to install a Chromedriver.
You have two methods for this.

- Method 1: Install locally to PATH
- Method 2: Use Docker

### Method 1: Install it locally to your PATH

https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver

**Quick installation**
- Mac users with Homebrew installed: brew tap homebrew/cask && brew cask install chromedriver
- Debian based Linux distros: sudo apt-get install chromium-chromedriver
- Windows users with Chocolatey installed: choco install chromedriver

**Manual**
- Lookup your Chrome version (url: chrome://settings/help), should be 89 or 88.
- [Download the correct chromedriver for your version](https://sites.google.com/a/chromium.org/chromedriver/) 
- Unzip the archive to any location you seem fit, but remember where you put it. (ex. c:/tools/chromedriver.exe)
- Add the folder you extracted it to to your PATH.
    - Windows: 
        - Edit System Environment Variables
        - Environment Variables
        - Select "Path" and Click "Edit..."
        - Click "Browse" and select the folder where Chromedriver is located (ex. c:/tools)
    - Linux & Mac: This step is not needed if you use apt-get/homebrew

If you have issues setting up your chromedriver, you can watch this: [youtube video](https://www.youtube.com/watch?v=dz59GsdvUF8)

### Method 2: Using Docker

If you feel fancy and don't like weird drivers on your system you can spin up a docker container keep in mind you will not see the browser:

```
docker run -d -p 4444:4444 -v /dev/shm:/dev/shm selenium/standalone-chrome:4.0.0-beta-1-prerelease-20210207
```

and point your driver to the hub:

```java
//See SeleniumBase.java
driver = new RemoteDriver("http://localhost:4444/wd/hub")

```
