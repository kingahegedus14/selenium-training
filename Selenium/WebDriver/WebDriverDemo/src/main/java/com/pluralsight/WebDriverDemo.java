package com.pluralsight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class WebDriverDemo {
    public static void main (String args[]){

        ChromeOptions options = new ChromeOptions();
        //options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\k.hegedus\\Desktop\\Selenium\\WebDriver\\WebDriverDemo\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.pluralsight.com");
        //driver.navigate().to("http://pluralsight.com");
    }
}
