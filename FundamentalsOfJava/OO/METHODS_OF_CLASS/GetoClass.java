package OO.METHODS_OF_CLASS;

//getClass

//The getClass is a Method of Java Objects to know which Class belongs to a certain object. With it, we can 
//find out which class a variable belongs to.


public class GetoClass {

    public static void main(String[] args){

        String text = "Gabriel";
        System.out.println(text.getClass()); // => class java.lang.String
        //Although, see that, the full name of the object type is returned...

        //If you want the simple name of the class, use the method getSimpleName...
        System.out.println(text.getClass().getSimpleName()); // => String
    }

}