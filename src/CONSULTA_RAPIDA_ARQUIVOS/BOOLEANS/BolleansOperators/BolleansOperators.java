package BOOLEANS.BolleansOperators;
//BOOLEANS OPERATORS

//In the Java there are also booleans operators, to test with two or more different situations.
//The booleans operators are:
//      && - Operator AND
//      || - Operator OR
//      !  - Operator NOT
//      == - Operator EQUAL
//      === - Opertator EXTRICT EQUAL


public class BolleansOperators {

    public static void main(String[] args){

        //Let's test booleans operators...
        boolean truth = true;
        boolean lie = false;

        if(truth && lie){
            System.out.println(truth && lie); // => | Nothing, because true and fause don't generate "true"
        } 
        if(truth || lie){
            System.out.println(truth || lie); // => true
        } 
        if(truth == !lie){ //Here we are using the equal operator along with the negation...
            System.out.println(truth); // => true
        }

    }

}