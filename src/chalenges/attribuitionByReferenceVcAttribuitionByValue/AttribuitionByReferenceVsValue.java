public class AttribuitionByReferenceVsValue {
    public static void main(String[] args){
        //Ex 01...
        int a = 3;
        int b = a;
        a--;
        b++;

        System.out.println("Ex 01");
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b + "\n");
        
        //Ex 02...
        ClassDate data = new ClassDate();
        data.day = 26;
        data.month = 03;
        data.year = 1991;
        System.out.println("Ex 02");
        System.out.printf("%s/%s/%s\n", data.day, data.month, data.year);

        ClassDate date = data;
        System.out.printf("%s/%s/%s\n\n", date.day, date.month, date.year);
        date.year = 2023;

        System.out.printf("%s/%s/%s\n", data.day, data.month, data.year);
        System.out.printf("%s/%s/%s\n", date.day, date.month, date.year);

        /*  Ex 01 - Exemplo da atribuição por valor, note como cada valor mudará de forma diferente, pois os valores
                    estão armazenados em espaços diferentes de memória;
         */

        /*  Ex 02 - Neste exemplo, no que a atribuição por referência faz com que ambas as variáveis apontem para o
                    mesmo objeto, se uma muda, a outra também;
         */
    }
}