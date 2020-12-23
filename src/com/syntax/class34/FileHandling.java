package com.syntax.class34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;

public class FileHandling {
    public static void main(String[] args) throws IOException, InterruptedException {

//        storing the path of a file in a String variable
        String path = "/Users/evgeniya/eclipse-workspace/8JavaBatch/src/com/syntax/class34/Credentials.properties";

//        creating a connection to file
        FileInputStream fileInputStream = new FileInputStream(path);

//        creating an object
        Properties properties = new Properties();

//        loading the data from file to java program
        properties.load(fileInputStream);

//        getting the values
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        int phoneNumber = Integer.parseInt(properties.getProperty("phoneNumber"));
        System.out.println(phoneNumber);

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);

        Thread.sleep(1000);
        driver.quit();
    }
}