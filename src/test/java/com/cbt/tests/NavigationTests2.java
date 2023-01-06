package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests2 {

    public static void main(String[] args) {
        testChrome();
        testFirefox();
        testEdge();
        testSafari();

    }

    public static void testChrome() {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String googleTitle = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String etsyTitle = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(googleTitle, driver.getTitle());

        driver.navigate().forward();
        StringUtility.verifyEquals(etsyTitle, driver.getTitle());

        driver.close();
    }

    public static void testFirefox() {
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String googleTitle = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String etsyTitle = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(googleTitle, driver.getTitle());

        driver.navigate().forward();
        StringUtility.verifyEquals(etsyTitle, driver.getTitle());

        driver.close();


    }

    public static void testEdge() {
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("https://google.com");
        String googleTitle = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String etsyTitle = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(googleTitle, driver.getTitle());

        driver.navigate().forward();
        StringUtility.verifyEquals(etsyTitle, driver.getTitle());

        driver.close();


    }

    public static void testSafari() {
        WebDriver driver = BrowserFactory.getDriver("safari");
        driver.get("https://google.com");
        String googleTitle = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String etsyTitle = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(googleTitle, driver.getTitle());

        driver.navigate().forward();
        StringUtility.verifyEquals(etsyTitle, driver.getTitle());

        driver.close();


    }


}