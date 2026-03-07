package org.testleaf.week1.homeassignment;

public class IsPrime {
public static void main(String[] args) {
   
    int n = 10;
    for (int i = 2;i<=n-1; i++)
    {
        if (i%2==0)
        {
            System.out.println("Not a prime number:"+""+i); 
        }
        else 
            {
             System.out.println("prime number:"+""+i);    
            }  
    }
}
}
