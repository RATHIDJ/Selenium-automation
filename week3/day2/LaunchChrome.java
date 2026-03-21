package org.testleaf.week3.day2;

import net.bytebuddy.implementation.bind.annotation.Super;

public class LaunchChrome extends LaunchBrowser {
 public void launch()
 {
    super.launch();
    System.out.println("Launch Chrome");
 }
 public static void main(String[] args) {
    LaunchChrome launchOptions = new LaunchChrome();
    launchOptions.launch();

 }
}
