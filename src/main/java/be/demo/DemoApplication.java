package be.demo;

public class DemoApplication {
    public static void main(String[] args) {
        final SeleniumDriver seleniumDriver = new SeleniumDriver();

        seleniumDriver.navigateTo("http://localhost:63342/selenium-demo/selenium-demo.main/index.html?_ijt=h5aftlsb35jjup3t1f2vd192eg");

        seleniumDriver.endSession();
    }
}
