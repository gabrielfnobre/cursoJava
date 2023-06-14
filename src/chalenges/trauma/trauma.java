/*Esse trauma aqui serve para você se lembrar que qualquer elemento que não esteja estático dentro de uma classe 
    pertence a instância a não a classe em si.
*/

public class trauma {
    
    int a = 3;

    public static void main(String[] args){
        trauma obj = new trauma();
        System.out.println(obj.a);
    }

}
