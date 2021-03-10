# Selenium Demo

This demo would hopefully guide some lost souls to get the hang of using selenium.

## Examples

You can run the examples by running. Be aware this have to be up when writing your tests.
````bash
cd /node
npm i
node server.js
````

## Slides

Best to install the [kc cli](https://www.npmjs.com/package/@infosupport/kc-cli)

Navigate to [slides](./slides) and run `kc serve`


## ChromeDriver

Before running anything best to install a chromeDriver:

https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver

### Extra

If you feel fancy and don't like weird drivers on your system you can spin up a docker container keep in mind you will not see the browser:

```
docker run -d -p 4444:4444 -v /dev/shm:/dev/shm selenium/standalone-chrome:4.0.0-beta-1-prerelease-20210207
```

and point your driver to the hub:

```java

driver = new RemoteDriver("http://localhost:4444/wd/hub")

```
