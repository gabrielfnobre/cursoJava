package CHARS;
//CHAR IN JAVA

//In Java, we have the primitive type "char", which is used when we want a variable with one charactere and 
//nothing else. This happens because "char" actually stores "integer" values represented in the UTF-8 table, 
//that is, we can also use integers in "char" and we will get a character from the UTF-8 table as a result.


public class CharInJava {

    public static void main(String[] args){

        //See, we should always write using single quotes in assignments for character values...
        char letraA = 'a';
        System.out.println(letraA); // => a

        //See, we can use integers, and they will match characteres from the UTF-8 table...
        char letraNumeral = 65; // 65 in the UTF-8 table matches the capital "a"...
        System.out.println(letraNumeral); // => A

        //See, when concatenating a "char" with a "integer", it needs to be transformed into an integer, 
        //through the cast, to get a match with some character from the table UTF-8
        char letraContatenada = (int) 'A' + 1; //As "A" matches 65 in the UTF-8 table, "A" + 1 matches with "66"
        System.out.println(letraContatenada); // => 8 | 66 is the character "B" in the UTF-8 table...

    }

}