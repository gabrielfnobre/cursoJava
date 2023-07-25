package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.AboutSuper;

//  SOBRE O SUPER...

/*  No java, quando queremos referenciar uma super classe seja para usar o construtor dela,
*   referenciar atributos ou métodos da super classe, usamos a palavra reservada "super".
*
*   Mas falando sobre construtores, temos que seguir algumas regras para referenciar ao
*   construtor corretamente. Pois a forma de chamar um construtor muda quando usamos um
*   construtor padrão e um construtor implementado:
*
*       CONSTRUTOR PADRÃO:
*
*   Um construtor padrão tem a característica de não receber nenhum parâmetro em sua
*   assinatura...
*
*       nomeDoConstrutor(){
*           ...
*       }
*
*   Para referenciar um construtor padrão, temos que usar o super da seguinte forma...
*
*       construtorDaClasseFilha(){
*           super();
*       }
*
*   Temos que usar o super sem chamar por nenhum parâmetro, isso fará com que o java
*   entenda que estamos chamando pelo método padrão. Mesmo que a super classe tenha
*   outros métodos construtores em sobrecarga, o "super()" irá chamar especificamente
*   pelo construtor padrão.
*
*
*       CONSTRUTOR IMPLEMENTADO:
*
*   Um construtor implementado tem a característica de receber parâmetros em sua
*   assinatura...
*
*       nomeDoConstrutor(int a, int b){
*           ...
*       }
*
*   Para referenciar um construtor padrão, temos que usar o super da seguinte forma...
*
*       construtorDaClasseFilha(){
*           super(int a, int b);
*       }
*
*   Note que vamos chamar pelo super passando parâmentros. Esses parâmetros têm de
*   ser iguais a assinatura correspondente ao método construtor que desejamos chamar
*   da Super classe...
*
*   Veja um exemplo, vá para a classe SuperClassComum...
*
* */

public class AboutSuper {
    public static void main(String[] args) {

        System.out.println();
        SubClassComum subComum = new SubClassComum();
        subComum.sayMyName();
        System.out.println();

        SubClassParams subClassParams = new SubClassParams("sub class");
        subClassParams.sayMyName();
        System.out.println();

        SuperOverload overload = new SuperOverload();
        overload.sayMyName();
        overload.showAllAttributes();
        System.out.println();

        SuperOverload overload2 = new SuperOverload("overload");
        overload2.showAllAttributes();
        System.out.println();

        SuperOverload overload3 = new SuperOverload("overload", "bySuper");
        overload3.showAllAttributes();
        System.out.println();

        SuperOverload overload4 = new SuperOverload("overload", "bySuper", "25/07/2023");
        overload4.showAllAttributes();
        System.out.println();


    }
}
