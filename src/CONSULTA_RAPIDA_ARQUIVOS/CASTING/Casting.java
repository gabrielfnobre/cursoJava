package CASTING;
//CASTING

//The Casting is a way to convert a primitive type into other primitve type, for example, we can cast a 
//float to int, double to int. Always converting a larger spaced type to a smaller spaced type.
//Also, it's impossible to use cast to convert numbers to strings. When we want convert numbers into strings
//we use parsers.


public class Casting {

    public static void main(String[] args){

        //See how we convert double into integer...
        double numberDouble = 1.5;
        int numberCastedToInt = (int) numberDouble; //cast is (type)...
        System.out.println(numberCastedToInt); // => 1

        //To convert integer into string we use toString method of the Double class...
        String text = Double.toString(numberCastedToInt); //Here take place two convertions, to double and string
        System.out.println(text); // => 1.0
        System.out.println(text.getClass().getSimpleName()); // => String
        //getClass returns the full name of the Class Java of that variable, and getSimpleName simplifies the 
        //full name... 

    }

}