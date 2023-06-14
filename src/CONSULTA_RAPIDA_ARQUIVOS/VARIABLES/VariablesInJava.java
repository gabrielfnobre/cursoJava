package VARIABLES;
//VARIABLES IN JAVA

//In Java we can use variables without fear that a referece to the memory space of the assigned variable 
//will be passed to the receiving variable. The patern in Java is, that a variable that receives another 
//variable, takes only its values.


public class VariablesInJava {

    public static void main(String[] args){

        //See that the variable second takes only the value of the variable first...
        int first = 5;
        int second = first;
        System.out.println(second); // => 5 | the variable takes only the value...

        first = 10; //even if another value is assigned in the variable "first"...
        System.out.println(second); // => 5 | the value in "second" is not changed...
    }

}