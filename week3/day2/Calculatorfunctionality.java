package org.testleaf.week3.day2;

public class Calculatorfunctionality {
//addNumbers
public void addNumbers(int a, int b)
{
System.out.println(a+b);
}
public void addNumbers(int a, int b,int c)
{
System.out.println(a+b+c);
}
public static void main(String[] args) {
    Calculatorfunctionality calcOptions = new Calculatorfunctionality();
    calcOptions.addNumbers(10,20,30);
    //calcOptions.addNumbers(10, 20,c:30);

}
}
