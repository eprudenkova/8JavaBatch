package com.syntax.class29;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"drivers/geckodriver");
        WebDriver driver2 = new FirefoxDriver();
        driver2.get("http://www.google.com");

    }
}
