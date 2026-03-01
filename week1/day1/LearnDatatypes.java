package org.testleaf.week1.day1;

public class LearnDatatypes {
    //Main method - entry point of the execution
    public static void main(String[] args) {
        //declare d datatype
        //integer - wrapper class
        //int,byte,short,long - data types
        // variable - Camelcase
        // more than 1 word - first word in small
        //second and third word first letter in Upper
        byte age=33; // store -128 to 127
        System.out.println(age);

        //short - 32000
        int amount = 40000;
        System.out.println(amount);
        long mobile = 9176612881l;
        System.out.println(mobile);
        // float, double
        float rate = 7.25f;
        System.out.println(rate);
        
        float rupee1= 1.12346789f;
        System.out.println(rupee1);
        double rupee2 = 1.123456789;
         System.out.println(rupee2);
         // char - a single char - number, alphabet, special character
         char logo = 'T';
         System.out.println(logo);

         //boolean - true/false
         // condition satisifies - true
        // not satisfies - false

    boolean doyouhadbreaksfast = false;
    System.out.println(doyouhadbreaksfast);
    // string - 'collection of characters'
    String name = "Rathi";
    System.out.println(name);
    // more than 1 variable
    System.out.println(name+age);
    System.out.println(name+" "+age);


    }

}
