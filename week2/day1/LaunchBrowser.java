package org.testleaf.week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        //Launch the Browser
        //Chrome,Edge,Firefox 
        //everybrowser will have different drivers
        //Step1: Launch the browser
                ChromeDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();

    }

}
