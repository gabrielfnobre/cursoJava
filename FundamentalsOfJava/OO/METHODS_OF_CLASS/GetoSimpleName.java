package OO.METHODS_OF_CLASS;

//getSimpleName

//The getSimpleName is a Method of Java Objects to return simple name of Java Class...


public class GetoSimpleName {

    public static void main(String[] args){

        String text = "Gabriel";
        System.out.println(text.getClass()); // => class java.lang.String
        //getClass, returns the full name of Object Class...

        //If you want the simple name of the class, use the method getSimpleName...
        System.out.println(text.getClass().getSimpleName()); // => String
    }

}