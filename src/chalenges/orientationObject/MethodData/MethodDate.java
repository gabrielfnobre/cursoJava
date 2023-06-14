public class MethodDate {
    
    int day;
    int month;
    int year;

    void showsDate(){
        System.out.println(day + "/" + month + "/" + year);
    }
    
    String showsDateWithFormat(){
        return String.format("%d/%d/%d", day, month, year);
    }

}
