package org.testleaf.week1.day2;

public class Operators {

    public static void main(String[] args) {
    //java operators - symbol for a operator/function
    //add two numbers.. + function
    // assignment operator - assigning a value to a variable
    //Mathematical/Arithmetic operator 
    //Comparison operator
    //Logical Operator
    //Increment Operator
    int a = 8;
    int b = 4;
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
// Div reminder, quotient
    System.out.println(a/b);
    System.out.println(a%b);
//Comparison value return boolean result
// if the comparison is correct, it will return true
// if the comparison is wrong, it will return false
int c = 5;
int d = 7;
//equalto
 System.out.println(c==d);
//notequalto
 System.out.println(c!=d);
//lessthan
 System.out.println(c<d);
//greatertan
 System.out.println(c>d);
//less than equal to
 System.out.println(c<=d);
//greater than equal to
 System.out.println(c>=d);
//logical operators
// compare 2 conditions
// AND operator
// OR operator
System.out.println(c<=d && c==d);
System.out.println(c<=d || c==d);
//Increment or decrement operator
//Increment ++ the value will be increased by 1
int s=7;
//post increment ++
System.out.println(s++);
System.out.println(s);
//preincrement
System.out.println(++s);
//preDecrement
System.out.println(s--); //9
System.out.println(s); //8
System.out.println(--s); //7

}

}
