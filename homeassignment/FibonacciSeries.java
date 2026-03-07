package org.testleaf.week1.homeassignment;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 8;
        int f = 0;
       int s =1;
         for (int i=1;i<=n;++i )
            {
            System.out.println("fibonacci series"+""+f+"");
            int c = f+s;
           // System.out.println(c);
             f = s;
             s = c;

                }
       
    }

}
