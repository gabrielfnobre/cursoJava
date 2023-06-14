//VARIAVEIS:

/*  As variáveis em Java, assim como em todas as demais linguagens, armazenam
    valores no espaço de memória de um computador. Mas é importante reforçar 
    que no Java as variáveis tem particularidades especiais. Por exemplo:

        * FORTEMENTE TIPADAS: Uma variável em Java deve ter o seu tipo 
                declarado obrigatóriamente antes da inicialização da variável.
                E NÃO PODEM MAIS MUDAR o seu tipo;

        * ARMAZENAM VALORES CONFORME O TEMPO DE EXECUÇÃO: Quando uma variável
                tem o seu valor trocado no decorrer da execução de um
                algoritmo, todas as linhas anteriores que fizerem referência 
                àquela variável antes do valor dela ter sido trocado, vão 
                operar sobre o valor antigo.
                Operações sobre o valor novo só valerão para linhas de código
                que estiverem após a troca do valor;

    Veja o exemplo abaixo...
 
 */

public class Variables {
    public static void main(String[] args){
        
        //Aqui temos uma variável do tipo double
        double raio = 3.4;

        //Aqui, não é uma variável, e sim uma constante, constantes no Java
        //recebem o "final" indicando que esse valor é o final e não poderá
        //ser trocado. Além disso, note que as letras estão em maiúsculo.
        //Por convenção, as letras de uma constante, tem que ser maiúsculas.
        final double PI = 3.14159;
        double area = PI * raio * raio;

        //Note que o valor do primeiro resultado funciona conforme o 
        //planejado.
        System.out.println("Primeiro resultado: " + area);

        //Mas note que fizemos uma troca no valor do raio...
        raio = 4;
        //Embora o valor tenha sido trocado, como estamos chamando a 
        //variável "area" que foi executada antes de termos feito a troca
        //do valor, ela não vai aderir ao valor novo.
        System.out.println("Segundo resultado: " + area);

        //Porém se fizermos agora a mesma conta da circunferência após a
        //troca do valor do raio, o valor da circunferência mudará.
        area = PI * raio * raio;
        System.out.println("Terceiro resultado: " + area);

    }
}
