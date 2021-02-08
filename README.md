# Selenium Demo

This demo would hopefully guide some lost souls to get the hang of using selenium.

## ChromeDriver

Before running anything best to install a chromeDriver:

https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver

If you feel fancy and dont like weird drivers on your system you can spin up a docker container:

```
docker run -d -p 4444:4444 -v /dev/shm:/dev/shm selenium/standalone-chrome:4.0.0-beta-1-prerelease-20210207
```

and point your driver to the hub:

```java

driver = new RemoteDriver("http://localhost:4444/wd/hub")

```
