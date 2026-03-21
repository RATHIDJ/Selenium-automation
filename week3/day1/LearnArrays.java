package org.testleaf.week3.day1;

import java.util.Arrays;

public class LearnArrays {
    public static void main(String[] args) {
      //  int number = 10;
      // array index starts from 0
      // array literal
      int[] scores={100,70,88,90,50};
     
      // get the number of data
      int numberOfData=scores.length;
      System.out.println("THe Array number is:"+numberOfData);
      System.out.println(scores[2]);
      for (int i=0;i<numberOfData;i++)
        {
        System.out.println(scores[i]);
        }
   //sort the array in ascending order --> Arrays
    Arrays.sort(scores);
    System.out.println("Lowest number in the array:"+scores[0]);
    System.out.println("Highest number in the array:"+scores[4]);
    System.out.println("Highest number in the array:"+scores[numberOfData-1]);
//instantstiation -> know no of data -> don't know the data
   String[] teams=new String[2];
   teams[0]="India";
   teams[1]="Australia";
       }
}
