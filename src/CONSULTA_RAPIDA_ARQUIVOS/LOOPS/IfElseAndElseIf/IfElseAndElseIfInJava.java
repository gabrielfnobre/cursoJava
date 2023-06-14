package LOOPS.IfElseAndElseIf;
//IF, ELSE AND ELSE IF IN JAVA

//In Java we can also use conditionals "if", "else" and "else if". And as in others languages, when the 
//body of the "if" has only one line, the "{" is optional.


public class IfElseAndElseIfInJava {

    public static void main(String[] args){

        //See that there's no have secret, it's the same in the other languages...
        int number = 10;
        if(number > 11){
            System.out.println("Esse número é maior do que 11");
        } else if(number == 11){
            System.out.println("Esse número é igual a 11");
        } else {
            System.out.println("Esse número é menor que 11"); // => Esse número é menor que 11
        }

    }

}