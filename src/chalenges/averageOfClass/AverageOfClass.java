/*  Nesse chalenge a missão é:

        Construir uma aplicação que pegue notas de alunos, não importa quantas notas sejam 
        e devolver a média de todas as médias recolhidas. E só parar a execução do programa
        se o usuário entrar com uma nota que seja abaixo de "0", como -1 por exemplo.

        Mas para fazer a contagem da média, os seguintes filtros deverão ser feitos:

            - Não pode contabilizar notas que sejam acima de 10;
            - Não a media só pode ser tirada de acordo com o número de entradas que
                o usuário fez, mas somente das entradas que ele fez corretamente, ou
                seja, de valores que vão de 0 a 10;
            - Se o usuário digitar uma nota acima de 10, o programa não vai parar, 
                mas também, ele não vai contabilizar a nota e nem a entrada de 
                usuário;
            - Para finalizar o programa, o usuário só tem que digitar um valor abaixo
                de 0, quando isso acontecer, uma mensagem será mostrada ao usuário 
                indicando qual é a média da turma;
 */

import javax.swing.JOptionPane;

public class AverageOfClass {
    public static void main(String[] args){
        Double inputGrades = 0D;
        Double total = 0D;
        Integer validGrades = 0;

        while(inputGrades >= 0){
            inputGrades = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Digite a nota do aluno: ")
                );
            if(inputGrades >=0 && inputGrades <= 10){
                total += inputGrades;
                validGrades++;
            }
        }

        Double average = total / validGrades;
        JOptionPane.showMessageDialog(null, 
            String.format("A media da nota da classe e de %.2f", average)
            );

        System.exit(0);

    }
}
