package org.testleaf.week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
public static void main(String[] args) {
             ChromeDriver driver=new ChromeDriver();
        driver.get("http://leafground.com/dashboard.xhtml");
        driver.manage().window().maximize();
        String parentAddress = driver.getWindowHandle();
        System.out.println(parentAddress);
      // driver.findElement(null)
      driver.findElement(By.xpath("//span[text()='Open']")).click();
        Set<String> allAddress = driver.getWindowHandles();
        System.out.println(allAddress);
        List<String> address = new ArrayList<String>(allAddress);
        String childAddress = address.get(1);
        System.out.println(childAddress);
        String childTitle = driver.getTitle();
        System.out.println(childTitle);
        driver.switchTo().window(childAddress);
        driver.close();
        String parentWindowAddress = address.get(0);
        driver.switchTo().window(parentWindowAddress);
        //driver.quit();
        String title =  driver.getTitle();
        System.out.println(title);
}
}
