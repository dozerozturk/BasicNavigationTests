package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationTests {

    public static void main(String[] args) throws InterruptedException {
        chrome();
        firefox();
        edge();
        safari();

    }


    public static void chrome() throws InterruptedException{
        //1. Open	browser
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2. Go to website https://google.com
        driver.get("https://google.com");

        //3. Save the	title in a string variable
        String googleTitle= driver.getTitle();
        System.out.println(googleTitle);

        //4. Go to https://etsy.com
        driver.navigate().to("https://etsy.com");

        //5. Save the	title in a string variable
        String etsyTitle=driver.getTitle();
        System.out.println(etsyTitle);

        //6. Navigate	back to	previous page
        driver.navigate().back();

        //7. Verify that title is same is in step 3
        String googleTitle2= driver.getTitle();
        StringUtility.verifyEquals(googleTitle,googleTitle2);


        //8. Navigate forward to previous page
        driver.navigate().forward();


        //9. Verify that title is same is in step 5
        String etsyTitle2=driver.getTitle();
        StringUtility.verifyEquals(etsyTitle,etsyTitle2);

        driver.close();


    }


    public static void firefox() throws InterruptedException{
        //1. Open	browser
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.manage().window().maximize();
        //2. Go to website https://google.com
        driver.get("https://google.com");


        //3. Save the	title in a string variable
        String googleTitle= driver.getTitle();
        System.out.println(googleTitle);


        //4. Go to https://etsy.com
        driver.navigate().to("https://etsy.com");

        //5. Save the	title in a string variable
        String etsyTitle=driver.getTitle();
        System.out.println(etsyTitle);

        //6. Navigate	back to	previous page
        driver.navigate().back();

        //7. Verify that title is same is in step 3
        String googleTitle2= driver.getTitle();
        StringUtility.verifyEquals(googleTitle,googleTitle2);


        //8. Navigate forward to previous page
        driver.navigate().forward();


        //9. Verify that title is same is in step 5
        String etsyTitle2=driver.getTitle();
        StringUtility.verifyEquals(etsyTitle,etsyTitle2);

        driver.close();


    }

    public static void edge() throws InterruptedException{
        //1. Open	browser
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.manage().window().maximize();
        //2. Go to website https://google.com
        driver.get("https://google.com");


        //3. Save the	title in a string variable
        String googleTitle= driver.getTitle();
        System.out.println(googleTitle);


        //4. Go to https://etsy.com
        driver.navigate().to("https://etsy.com");

        //5. Save the	title in a string variable
        String etsyTitle=driver.getTitle();
        System.out.println(etsyTitle);

        //6. Navigate	back to	previous page
        driver.navigate().back();

        //7. Verify that title is same is in step 3
        String googleTitle2= driver.getTitle();
        StringUtility.verifyEquals(googleTitle,googleTitle2);


        //8. Navigate forward to previous page
        driver.navigate().forward();


        //9. Verify that title is same is in step 5
        String etsyTitle2=driver.getTitle();
        StringUtility.verifyEquals(etsyTitle,etsyTitle2);

        driver.close();


    }

    public static void safari() throws InterruptedException{
        //1. Open	browser
        WebDriver driver = BrowserFactory.getDriver("safari");
        driver.manage().window().maximize();
        //2. Go to website https://google.com
        driver.get("https://google.com");

        //3. Save the	title in a string variable
        String googleTitle= driver.getTitle();
        System.out.println(googleTitle);

        //4. Go to https://etsy.com
        driver.navigate().to("https://etsy.com");

        //5. Save the	title in a string variable
        String etsyTitle=driver.getTitle();
        System.out.println(etsyTitle);

        //6. Navigate	back to	previous page
        driver.navigate().back();

        //7. Verify that title is same is in step 3
        String googleTitle2= driver.getTitle();
        StringUtility.verifyEquals(googleTitle,googleTitle2);


        //8. Navigate forward to previous page
        driver.navigate().forward();


        //9. Verify that title is same is in step 5
        String etsyTitle2=driver.getTitle();
        StringUtility.verifyEquals(etsyTitle,etsyTitle2);

        driver.close();

    }

}
