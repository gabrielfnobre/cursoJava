import java.util.Scanner;

public class InputEmployeSalary {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos calcular a media do seu salario dos ultimos 3 meses...");
        System.out.print("Digite o valor do primeiro salario: ");
        double firstSalary = convertSalary(sc.next());
        System.out.print("Digite o valor do segundo salario: ");
        double secondSalary = convertSalary(sc.next());
        System.out.print("Digite o valor do terceiro salario: ");
        double thirdSalary = convertSalary(sc.next());
        System.out.printf("\nSua media salarial para estes tres meses eh de: R$ %.2f\n", (
            (firstSalary + secondSalary + thirdSalary) / 3)
            );

        sc.close();
    }
 
    public static double convertSalary(String salary){
        double salaryConverted = Double.parseDouble(salary.replace(',', '.'));
        return salaryConverted;
    }

}
