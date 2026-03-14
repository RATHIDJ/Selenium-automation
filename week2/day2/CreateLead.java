package org.testleaf.week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class CreateLead {

      public static void main(String[] args) {
        //Launch the Browser
        //Chrome,Edge,Firefox 
        //everybrowser will have different drivers
        //Step1: Launch the browser
        //Execute the browser in guest mode
        ChromeOptions opt=new ChromeOptions();
        opt.addArguments("guest");

          ChromeDriver driver=new ChromeDriver(opt);
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        //findElement - locate a WebElement
        //sendkeys - enter a value in a text field
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        //click login button - click
        driver.findElement(By.className("decorativeSubmit")).click();
        //click crm link
        driver.findElement(By.linkText("CRM/SFA")).click();
       //driver.findElement(By.partialLinkText("CRM")).click();
        driver.findElement(By.linkText("Leads")).click();
       
        driver.findElement(By.linkText("Create Lead")).click();
       //enter company name
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rathi");
       driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Durai");
        
       WebElement sourceEle = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select options = new Select(sourceEle);
        //options.selectByIndex(3);

        options.selectByVisibleText("Partner");

       driver.findElement(By.name("submitButton")).click();
        
    }

}
