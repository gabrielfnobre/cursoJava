package Enums;

//  ENUMS:

/*  Os enums são um tipo especial de classe em Java que permite você criar um conjunto limitado de valores
*   possíveis. Eles são usados para representar coisas como dias da semana, meses do ano ou cores.
*
*   Para criar um enum, você usa a palavra-chave enum seguida pelo nome do enum. Em seguida, você pode definir as
*   constantes do enum dentro do corpo do enum.
*
*   Por exemplo, o seguinte código cria um enum chamado DaysOfTheWeek:
*
*   enum DaysOfTheWeek {
*       SUNDAY,
*       MONDAY,
*       TUESDAY,
*       WEDNESDAY,
*       THURSDAY,
*       FRIDAY,
*       SATURDAY
*   }
*
*   Você pode usar enums da mesma forma que usa qualquer outra classe. Por exemplo, o seguinte código cria uma variável
*   do tipo DaysOfTheWeek e atribui a ela o valor SUNDAY:
*
*       DaysOfTheWeek day = DaysOfTheWeek.SUNDAY;
*
*   Você também pode usar os métodos valueOf() e values() para trabalhar com enums. O método valueOf() permite você
*   recuperar uma constante de enum pelo seu nome, e o método values() permite você recuperar um array com todas as
*   constantes de enum.
*
*   Por exemplo, o seguinte código recupera a constante de enum SUNDAY pelo seu nome:
*
*       DaysOfTheWeek day = DaysOfTheWeek.valueOf("SUNDAY");
*
*   E o seguinte código recupera um array com todas as constantes de enum DaysOfTheWeek:
*
*       DaysOfTheWeek[] days = DaysOfTheWeek.values();
*
*   Os enums são uma ótima maneira de representar um conjunto limitado de valores possíveis em Java. Eles são fáceis de
*   usar e fornecem uma série de benefícios, como segurança de tipo e documentação automática.
*
*   Outra coisa importante sobre as Enums, é que nós podemos atribuir valores sobre as constantes para usá-las.
*   Podemos fazer isso usando o método construtor de uma Enum, da seguinte forma:
*
*   public enum Colors{
*
*       RED(255,0,0),
*       GREEN(0,255,0),
*       BLUE(0,0,255);
*
*       private final int red;
*       private final int green;
*       private final int blue;
*
*       Colors(int red, int green, int blue){
*           This.red = red;
*           This.green = green;
*           This.blue = blue;
*       }
*   }
*
*   Note que na enum acima já iniciamos as variáveis usando parênteses e parâmetros, essa implementação esquisita é a
*   forma de chamarmos o método construtor de uma enum. Não precisamos atribuir a constante a uma variável, basta dar
*   nome a constante e chamar o método construtor já passando os parâmetros da Enum. O método construtor está mais
*   abaixo.
*
*   Veja essa implementação na prática no código logo abaixo...
 */

public enum Colors {

    RED(255,0,0),
    GREEN(0,255,0),
    BLUE(0,0,255);

    private final int red;
    private final int green;
    private final int blue;

    Colors(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    //Esse método exibe a cor em RGB...
    public String getColor() {
        return String.format("(%d,%d,%d)", red,green,blue);
    }

}
