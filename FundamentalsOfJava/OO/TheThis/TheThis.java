package OO.TheThis;

//  O THIS:

/*  O "this" é uma palavra reservada da linguagem java que tem o missão de fazer referência sempre
    à instância de uma classe. SEMPRE À INSTÂNCIA, e NUNCA À CLASSE.

    O this serve para que possamos capturar de maneira correta:
        - 1 instância específica;
        - Os atributos e métodos daquela instância;

    Não podemos usar o this para:
        - Referenciar a classe;
        - Referenciar atributos ou métodos estáticos de uma classe;
        - Dentro de um método estático para referenciar uma instância ou seus membros;

    Quando vamos querer usar o this?
        - Para resolver ambiguidade entre os parâmetros de um construtor e os nomes dos atributos
            da instância: 
            Por exemplo, geralmente quando criamos um construtor, no campo de 
            parâmetros dele usamos como nome dos atributos os mesmos nomes de atributos que foram
            gerados na classe, isso pode confundir o java. Para evitar isso usamos o this...

                public class Exemplo(){
                    private int valor;

                    public Exemplo(int valor){
                        this.valor = valor;
                    }
                }

                Explicando:
                    Note que o nome do atributo da instância é "valor" e o nome do parâmetro do
                    construtor também é valor, se não usássemos o "this" no construtor para 
                    mostrar que queremos que qualquer valor inteiro colocado como parâmetro do 
                    construtor seja atribuído ao atributo de instância "valor", teríamos um 
                    construtor inutíl. Pois o java entenderia que queremos atribuir o parâmetro
                    ao próprio parâmetro.

        - Para fazer uma "Chamada de Construtor":
            Chamada de Construtor é quando usamos 1 construtor para chamar outro construtor, 
            geralmente usamos isso no construtor padrão, da seguinte forma:

                public class Exemplo{
                    private int valor;

                    public Exemplo(){
                        this(0);
                    }

                    public Exemplo(int valor){
                        this.valor = valor;
                    }
                }

                Explicando:
                    Note que o construtor padrão (sem parênteses) usa o "this" como se fosse uma
                    função para chamar o outro construtor de sobrecarga que pede por um valor 
                    inteiro como parâmetro. Observe que para chamar o outro construtor temos que 
                    passar valores como parâmetro para ele.
                    Será que podemos repetir isso quantas vezes quisermos em quantas sobrecargas 
                    quiséssemos? A resposta é sim, pois o java iría identificar os construtores 
                    pelos seus campos de parâmetros.
                
                OBSERVAÇÃO:
                    -   Quando o "this" é usado para chamar um construtor, ele deve ser a
                        primeira sentença do bloco;

                    -   Não faça constutores em looping, se não o java não irá compilar, por 
                        exemplo, fazer o construtor padrão chamar pelo construtor de 1 parâmetro
                        e fazer o construtor de um parâmetro chamar pelo construtor padrão, isso
                        geraría um looping infinito. O java nem compila;


        - Para referenciar a uma instância ou a um membro dela:
            Podemos usar o this quando queremos referenciar uma instância inteira, para retorná-la, 
            passá-la como parâmetro ou para pegar seus métodos ou atributos. Veja como podemos 
            fazer isso...

                Passando instância como parâmetro:

                    void metodoExecutor(){
                        metodoQualquer(this);
                    }    

                    void metodoQualquer(nomeDaClasse obj){
                        System.out.println(obj.valorTal);
                    }

                    Explicando:
                        Quando "metodoExecutor()" for chamado a partir de uma instância, ele vai 
                        chamar o "metodoQualquer()" passando a instância como parâmetro, que vai 
                        imprimir no console o valor que estiver no atributo "valorTal", pois o 
                        "this" nesse contexto faz referência a toda a instância em si;

                Pegando o valor de um atributo da instância:

                    this.atributo

                    Explicando:
                        Basta usar o "this" a notação ponto e o nome do atributo para pegar o 
                        valor que esse atributo possuí;

                Retornando o objeto inteiro:

                    NomeDaClasse nomeDoMetodo(){
                        return this
                    }

                    Explicando:
                        Note que podemos também criar um método que retorna o objeto instanciado
                        basta para isso criarmos um método que possuí como retorno justamente 
                        uma instância da classe e usar o "this" no retorno no método;

    Vejamos alguns exemplos (olhe tanto nesse arquivo como no arquivo TheThisInstancer.java)...

 */

public class TheThis {
    
    String name;
    String lastName;
    int age;
    
    //Ex 01
    TheThis(){
        this("nome");
    }
    
    //Ex 02
    TheThis(String name){
        this(name, "sobrenome", 0);
        this.name = name;
    }

    //Ex 03
    TheThis(String name, String lastName){
        name = name;
        lastName = lastName;
    }
    
    //Ex 04
    TheThis(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    //Ex 05
    String showTheThis(){
        return String.format("%s %s, he is %d years old", this.name, this.lastName, this.age);
    }
    
    //Ex 06
    void showMeAllAttributes(){
        TheThis obj = this;
        System.out.printf("All attributes this object:\nname: %s\nlast name: %s\nage: %d", obj.name, obj.lastName, obj.age);
    }

    /*  Ex 01 - Aqui temos um exemplo de uma chamada de construtor usando o "this", note que estamos 
                usando o this para chamar o método construtor do exemplo 2;
    */
    
    /*  Ex 02 - Aqui nós temos o exemplo de um construtor utilizando o "this" de 2 formas. Na primeira
                temos uma chamada de construtor, onde ele chama o método do exemplo 4 passando valores 
                como padrão. 
                Na segunda forma usamos o nome do parametro do método construtor é o mesmo nome do atributo 
                "name" da instancia. Se nós não tivéssemos usado o "this" para referenciar o atributo "name" 
                da instância, o método iria entender que o "name" é o mesmo "name" do parâmetro e não iria 
                fazer nada, pois um método com valor nulo seria atribuído ao mesmo método com o valor nullo. 
                Mas o "this" faz com que o valor seja referenciado para o atributo correto;
                
                OBSERVAÇÃO: Geralmente usamos os mesmos nomes dos atributos de uma instância no campo de 
                parâmetro do construtor. Então com frequência vamos ver o "this" sendo usado para 
                referenciar os atributos do objeto atual;
    */

    /*  Ex 03 - Aqui nós temos um exemplo sem o uso do "this", note que neste caso o java entende que nós
                estamos querendo atribuir o valor que foi colocado no parâmetro "name" do método no mesmo
                parâmetro "name" do método. Ou seja, não faz nada!
     */

    /*  Ex 04 - No quarto exemplo note, que utilizamos o this para todos os atributos, note como a 
                referência é feita corretamente;
     */
    
    /*  Ex 05 - Aqui temos um método usado para recuperar os valores da instância, note que conseguimos
                recuperar corretamente os valores graças ao "this";
    */
    
    /*  Ex 06 - No sexto exemplo, temos um método que captura a instância para a variável "obj" e nos
                retorna todos os atributos da instância;
    */

}
