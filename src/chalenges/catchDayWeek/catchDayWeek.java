//Nesse desafio temos que pegar um dia da semana digitado com o nome do dia e retornar o numeral correspondente ao dia
//Por exemplo:
//      Domingo -> 1
//      Terça -> 3
//      Sexta -> 6

import java.util.Scanner;

public class catchDayWeek {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("Digite o nome de um dia da semana (Sem acento ou caracteres especiais):");
        String day = sc.next();

        if(day.equalsIgnoreCase("domingo")){
            System.out.println(day + " corresponde ao dia: 1");
        } else if (day.equalsIgnoreCase("segunda")){
            System.out.println(day + " corresponde ao dia: 2");
        } else if (day.equalsIgnoreCase("terca")){
            System.out.println(day + " corresponde ao dia: 3");
        } else if (day.equalsIgnoreCase("quarta")){
            System.out.println(day + " corresponde ao dia: 4");
        } else if (day.equalsIgnoreCase("quinta")){
            System.out.println(day + " corresponde ao dia: 5");
        } else if (day.equalsIgnoreCase("sexta")){
            System.out.println(day + " corresponde ao dia: 6");
        } else if (day.equalsIgnoreCase("sabado")){
            System.out.println(day + " corresponde ao dia: 7");
        }

        sc.close();

    }
    
}
