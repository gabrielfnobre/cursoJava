package BOOLEANS;
//BOOLEANS

//Booleans are a primitive type that use only "true" and "false" values, or they can takes boolean expressions
//Booleans do not accept strings written as "true", or "int" with value 1 or 0, in Java booleans must always 
//get "true" ou "false"


public class Booleans {

    public static void main(String[] args){

        //Let's test booleans...
        boolean value = true; // booleans receive a true or false
        boolean valueFalse = (!false) != (!true); // but, too receive booleans expressions

        System.out.println(value); // => true
        System.out.println(valueFalse); // => true

    }

}