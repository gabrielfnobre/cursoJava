import java.time.Year;

public class ClassDateInstancer {
    public static void main(String[] args){
        
        ClassDate d1 = new ClassDate();
        var d2 = new ClassDate();

        d1.day = 26;
        d1.month = 3;
        d1.year = 1991;

        d2.day = 17;
        d2.month = 9;
        d2.year = 1991;

        System.out.printf("%d/%d/%d\n", d1.day, d1.month, d1.year);
        System.out.printf("%d/%d/%d\n", d2.day, d2.month, d2.year);

    }
}
