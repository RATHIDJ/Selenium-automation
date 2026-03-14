package org.testleaf.week2;

public class Browser 
{
    public void laodUrl()
    {
        System.out.println("Application url loaded successfully");
    }
    public String launchBrowser(String browsername)
    {
        System.out.println("Browser launched successfully");
            return browsername;
    }
    
public static void main(String[] args) {
    Browser test = new Browser();
    test.laodUrl();
    test.launchBrowser("www.google.com");
}
}
