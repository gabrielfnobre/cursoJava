package PaternVariables;

//  VARIAVEIS PADRÃO:

/*  No java temos o conceito de valores padrão para variáveis criadas dentro de uma classe.
    Isso significa que dentro do contexto de uma classe podemos criar variáveis SEM INICIALIZA-LAS, pois elas
    assumirão um valor por padrão.

    Note que estamos falando de VARIAVEIS e não de CONSTANTES, constantes sempre deverão ser inicializadas, 
    podemos até declarar uma constante de instância (não estática) dentro de uma classe sem inicializar ela, mas 
    em algum momento ela deverá ser inicializada dentro de um método construtor (e somente dentro de um método 
    construtor) para ser utilizada.

    Quais valores os tipos assumem por padrão?

        # byte -> 0;
        # int -> 0;
        # short -> 0;
        # long -> 0;
        # float -> 0.0;
        # double -> 0.0;
        # char -> '\u0000';
        # boolean -> false;
        # wrappers -> null; (String, Double e etc)

    OBSERVAÇÃO IMPORTANTE! Isso acontece somente dentro do contexto de classe, não dá pra fazer isso dentro
    de um método. Variáveis criadas dentro de um método sempre deverão ser inicializadas para poder ser 
    usadas.
 */


public class PaternVariables {

    final String NAME;
    static final String LAST_NAME = "MyLastName";
    
    static byte byteInClass;
    static int intInClass;
    static short shortInClass;
    static long longInClass;
    static float floatInClass;
    static double doubleInClass;
    static char charInClass;
    static boolean booleanInClass;
    static String stringInClass;

    PaternVariables(){
        NAME = "MyFirstName";
    }

    public static void main(String[] args){
        //EX01
        int a;
        // System.out.println(a); //descomente aqui para ver o que acontece...
        
        //EX02
        int b = 0;
        System.out.println("EX02:");
        System.out.println("value of b: " + b + "\n");
        
        //EX03
        PaternVariables myObj = new PaternVariables();
        System.out.println("EX03:");
        System.out.println("name of my object: " + myObj.NAME + " " + myObj.LAST_NAME + "\n");
        
        //Ex04
        System.out.println("EX04:");
        System.out.println("byte: " + byteInClass);
        System.out.println("int: " + intInClass);
        System.out.println("short: " + shortInClass);
        System.out.println("long: " + longInClass);
        System.out.println("float: " + floatInClass);
        System.out.println("double: " + doubleInClass);
        System.out.println("boolean: " + booleanInClass);
        System.out.println("String: " + stringInClass);
        System.out.print("char: " + charInClass);
    }

    /*  EX 01 - Neste exemplo podemos ver que dentro do contexto de um método, variáveis podem até ser criadas sem serem
                inicializadas, mas se não atribuirmos nenhum valor a elas posteriormente, elas NÃO IRÃO ASSUMIR NENHUM 
                VALOR POR PADRÃO, o código nem compila se tentarmos usar uma variável criada dentro de um método sem 
                nunca atribuir um valor á ela;
    */

    /*  EX 02 - Neste exemplo podemos ver que quando inicializamos uma variável criada dentro de um método, o código 
                irá executar sem problemas;
    */

    /*  EX 03 - Aqui podemos ver que 2 exemplos usando constantes, se analisarmos o código acima onde as constantes 
                foram declaradas, vamos ver que constantes SEMPRE DEVEM SER INICIALIZADAS, e elas podem ser 
                inicializadas em 2 contextos diferentes: no momento da inicialização ou dentro do método construtor da
                classe.
                OBSERVAÇÃO: Note que quando inicializamos uma constante dentro de um construtor, ela não pode ser 
                estática;
    */

    /*  EX 04 - Neste exemplo podemos ver que qualquer tipo inicializado na classe vai possuir um valor por padrão
                (desde que não seja uma constante).
                OBSERVAÇÃO: Note que colocarmos o tipo "char" por último, isso acontece por que o valor padrão de um
                char é o valor '\u0000' que significa "nulo", quando usamos esse valor dentro de um print ele não
                pula linha, mesmo dentro de um println ou usando o escape "\n". Por isso colocamos ele por último;
    */

}
