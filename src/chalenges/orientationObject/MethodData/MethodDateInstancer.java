public class MethodDateInstancer {
    public static void main(String[] args){
        
        MethodDate d1 = new MethodDate();
        var d2 = new MethodDate();

        d1.day = 26;
        d1.month = 3;
        d1.year = 1991;

        d2.day = 17;
        d2.month = 9;
        d2.year = 1991;

        d1.showsDate();
        d2.showsDate();

        System.out.println(d1.showsDateWithFormat());
        System.out.println(d2.showsDateWithFormat());

    }
}
