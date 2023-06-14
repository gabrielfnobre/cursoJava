package chalenges.ArraysGradesOfStudent;
import javax.swing.JOptionPane;

public class ArraysGradesOfStudent {
    public static void main(String[] args){
        
        int numberGrades = Integer.parseInt(JOptionPane.showInputDialog("Quantas notas do aluno voce deseja colocar?"));
        double[] grades = new double[numberGrades];
        double averableGrade = 0;
        String finalMesage = "As notas do aluno foram:\n";

        for(int i = 0; i < grades.length; i++){
            grades[i] = Integer.parseInt(JOptionPane.showInputDialog(String.format("Qual a %d nota?", i + 1)));
        }

        for(int i = 0; i < grades.length; i++){
            averableGrade += grades[i];
            finalMesage += String.format("\t%.1f\n", grades[i]);
        }

        averableGrade = averableGrade / numberGrades;

        JOptionPane.showMessageDialog(null, String.format("%s\nTotalizando uma media de: %.1f", finalMesage, averableGrade));
        System.exit(0);

    }

}
