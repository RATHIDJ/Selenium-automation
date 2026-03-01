package org.testleaf.week1.day2;

public class LearnContinue {
    public static void main(String[] args) {
        for (int i=1; i<=5 ; i++){
            if(i==3){
                continue; // skips the current iteration
            }
            System.out.println(i);
        }
    }

}
