package Constants;


//CONSTANTES:

/*  As constantes em Java, assim como em todas as demais linguagens, armazenam
    valores que não poderão ser mudados. As constantes em Java tem suas 
    particularidades. Por exemplo:

        * USO DO "FINAL": Toda constante em Java deve começar com a palavra 
                reservada "final". Isso quer dizer que aquela variável é uma
                variável que já recebeu o seu valor "final", portando não 
                poderá ter o seu valor reatribuído;    

        * FORTEMENTE TIPADAS: Uma constante em Java deve ter o seu tipo 
                declarado obrigatóriamente após a declaração da palavra 
                reservada "final" e antes da inicialização da variável;

        * CONVENÇÃO DAS LETRAS MAIÚSCULAS: No Java é uma convenção muito 
                importante usar letras maiúsculas no nome de uma constante
                Java. Todas as letras em maiúsculo;

    Veja o exemplo abaixo...
 
 */

public class Constants {
    public static void main(String[] args){
        
        //Aqui temos uma variável do tipo double
        double raio = 3.4;

        //Aqui, não é uma variável, e sim uma constante, constantes no Java
        //recebem o "final" indicando que esse valor é o final e não poderá
        //ser trocado. Além disso, note que por convenção, ela está em 
        //letras maiúsculas;
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
