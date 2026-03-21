package org.testleaf.week3.day2;

public class LearnStrings {

    public static void main(String[] args) {
   // String batch = new String ("Testleaf");
    String batch = "Selenium";
    int lengthOfString = batch.length();
    System.out.println("length of string:"+lengthOfString);
    String upperCase = batch.toUpperCase();
    System.out.println("uppercase is:"+upperCase);
  //.equals contains the exact value
  //.contains - compare the partial
  boolean contains = batch.contains("Sele");
  System.out.println("contains is:"+contains);
 boolean equalsIgnoreCase = batch.equalsIgnoreCase("sELENIUM");
 System.out.println("equals is:"+equalsIgnoreCase);
 String batchName = "Sel Feb 2026";
 int length = batchName.length();
 System.out.println(length);
 
 char charAtIndex2 = batchName.charAt(6);
 System.out.println("charAtIndex2:"+charAtIndex2);

// to convert a string into a character array
String companyName = "Testleaf";
char[] charArray =companyName.toCharArray();
System.out.println("charArray:"+charArray[5]);
String team = "Indian Cricket Team";
// String[] split = team.split("");
// System.out.println(split);
String[] split = team.split("a");
System.out.println(split[1]);

// substring - to convert the string into another string
String substring = team.substring(5);
System.out.println("substring is:"+substring);

String substring2 = team.substring(2,5);
System.out.println("substring is:"+substring2);
String amount = "$10000";
int rupee = 100;
System.out.println(amount+rupee);
String replaceAll = amount.replaceAll("[$]", "");

//convert string into intger = Integer - ParseInt 
int int1 = Integer.parseInt(replaceAll);
System.out.println(int1+rupee);
}

}
