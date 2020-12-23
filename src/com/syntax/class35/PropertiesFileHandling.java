package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileHandling {
    public static void main(String[] args) throws InterruptedException, IOException {

        String baseAddress = System.getProperty("user.dir");
        String fileAddress = baseAddress + "/" + "ConfigData.properties";

        FileInputStream fis = new FileInputStream(fileAddress);
        Properties prop = new Properties();
        prop.load(fis);

        String username = prop.getProperty("username");//return String
        System.out.println(username);

//        System.out.println(prop.get("username"));//return Object

        FileOutputStream fos = new FileOutputStream(fileAddress);
        prop.setProperty("phoneNumber","123456789");
        prop.store(fos, "Adding phone number");

//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.facebook.com");
//        driver.findElement(By.id("email")).sendKeys(username);
//        driver.findElement(By.id("pass")).sendKeys(password);
//
//        Thread.sleep(1000);
//        driver.quit();
    }
}