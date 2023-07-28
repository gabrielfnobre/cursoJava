package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.Interfaces;

//  SOBRE INTERFACES:

/*  Quando vamos cumprir qualquer ação legal na justiça, toda ação possuí regras
*   contratuais que precisam ser seguidas para que a ação possa ser válida.
*
*   Por exemplo, se vamos reformar a nossa casa e fazer mudanças na sua estrutura
*   precisaremos de um alvará da prefeitura para fazer isso.
*
*   As interfaces no java podem ser comparadas a esse alvará. O objetivo das
*   interfaces é definir regras que uma classe tem que seguir para que a
*   implementação seja feita de forma correta.
*
*   Por exemplo, imagine que temos uma classe Ferrari e uma classe Carro, a
*   Ferrari é um carro, portanto ela pode herdar características de Carro, mas
*   a Ferrari não é apenas um carro comum, ela é um carro esportivo e também um
*   carro de luxo. Portanto existem alguns conceitos que "DEVEM" ser
*   implementados a Ferrari para que ela possa ser encarada como um carro
*   esportivo e de luxo. Como obrigar a classe Ferrari a implementar essas
*   características? A resposta é: por meio de uma interface.
*
*   As interfaces estabelecem algumas regras que uma classe que a implementa é
*   obrigada a seguir para que o código possa ser compilado. Ela faz isso por
*   obrigar a classe a implementar constantes e métodos que existem dentro da
*   interface, se a classe não implementar simplesmente o código dá erro na
*   hora de compilar.
*
*   Siga para o arquivo Sportive para ver a implementação...
* */

public class AboutInterface {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari();

        System.out.println();                                                   //Note que a princípio o carro está
        System.out.println("Atual speed: " + ferrari.getSpeed());               //parado...
        System.out.println("Atual delta: " + ferrari.getDelta());
        System.out.println("Atual turbo situation: " + ferrari.getTurbo());
        System.out.println("Atual air situation: " + ferrari.getAir());
        System.out.println();

        ferrari.accelerate();       //Após as primeiras aceleradas a velocidade do carro muda...
        ferrari.accelerate();
        System.out.println();

        ferrari.turnOnTurbo();      //Ao ligar o turbo a aceleração aumenta!!
        ferrari.accelerate();
        ferrari.accelerate();
        System.out.println();

        ferrari.turnOnAir();        //Ao ligar o ar a aceleração abaixa em 5km...
        ferrari.accelerate();
        ferrari.accelerate();
        ferrari.accelerate();
        System.out.println();

        ferrari.breaking();         //Ao frear, veja que o carro freia em relação ao força de aceleração...
        ferrari.breaking();
        ferrari.turnOffTurbo();     //Ao desligar o turbo e o ar a força de freagem será reduzida, pois a
        ferrari.turnOffAir();       //aceleração também foi reduzida...
        System.out.println("Atual speed: " + ferrari.getSpeed());
        System.out.println();

        ferrari.breaking();         //Aceleração voltou a ser de 20km e a freagem também...
        ferrari.breaking();
        ferrari.breaking();
        ferrari.breaking();
        System.out.println("Atual speed: " + ferrari.getSpeed());
        ferrari.turnOnTurbo();      //Turbo foi ligado, então a frenagem ficará mais forte...
        ferrari.breaking();
        ferrari.breaking();
        ferrari.breaking();
        ferrari.breaking();        //Até parar o carro...
        System.out.println("Atual speed: " + ferrari.getSpeed());
        System.out.println();

        ferrari.strangerMethod(); //Aqui é só para mostrar que métodos padrão criados em implementações podem ser
                                    //invocados, mesmo que não tenham sido implementados de fato nas classes que
                                    //utilizam a interface. Eles assumirão o valor padrão.

    }
}
