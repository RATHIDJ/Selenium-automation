package org.testleaf.week3.day2;

public class ReverseString {
public static void main(String[] args) {
    String reverseString = "Testleaf";
    char[] charArray =reverseString.toCharArray();
    System.out.println(charArray);
    int length = reverseString.length();
    System.out.println(length);
  for (int i=length-1;i>0; i--)
  {
    System.out.println(charArray[i]);

  }
   
}
}
