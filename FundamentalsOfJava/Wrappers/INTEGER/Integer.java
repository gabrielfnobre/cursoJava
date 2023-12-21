package Wrappers.INTEGER;

//INTEGER

//When we want to use integers Java we must use "int" as variable prefix...


public class Integer {

    public static void main (String[] args){

        //See here the "int" being used
        int number = 0;
        number += 3;
        System.out.println("The number zero added to three gives: " + number);
        // => The number zero added to three gives: 3

        //Heads up! Integers don't accept float numbers, you need to use only integers
        //Even when we use an integer that can give a floating point number, Java truncates the number down.
        //For example:
        int division = 5 / 2;
        System.out.println(division); // => 2
    
    }

}