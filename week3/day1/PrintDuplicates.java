package org.testleaf.week3.day1;

import java.util.Arrays;

public class PrintDuplicates {
public static void main(String[] args) {
    int[] dups={2,5,7,7,5,9,2,3};
    Arrays.sort(dups);
    int numberOfData=dups.length;
    //System.out.println("Lowest number in the array:"+num[0]);
    for(int i=0;i<numberOfData;i++)
        {
   // System.out.println("Lowest number in the array:"+dups[i]);
     for(int j=i+1;j<numberOfData;j++)
     {
    if(dups[i]==dups[j]){
       System.out.println(" Duplicate number in the array:"+dups[i]);
    }
       }
       }
}
}
