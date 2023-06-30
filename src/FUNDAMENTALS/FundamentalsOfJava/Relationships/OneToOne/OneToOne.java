package FUNDAMENTALS.FundamentalsOfJava.Relationships.OneToOne;

// UM PARA UM:

/*  O relacionamento 1 para 1 é o relacionamento onde:
 *
 *      - 1 objeto que é composto por 1 objeto de outra classe, só pode ser composto por 1
 *          único objeto daquela classe;
 *
 *      - Ao mesmo tempo, aquele único objeto que foi composto por um 1 objeto da classe
 *          compositora, só pode ser composto por àquele 1 objeto que a compôs, ele não
 *          pode ser composto por outros objetos dáquela classe;
 *
 *  Abaixo usamos como exemplo uma pessoa, pois uma pessoa só pode ter 1 coração, e o
 *  coração é único para cada pessoa. Veja também as classes Person e Hearth para entender
 *  como a implementaçãa 1 para 1 é feita...
 */

public class OneToOne {
    public static void main(String[] args) {

        //Ex01
        System.out.println("\nEx01:");

        Person john = new Person("John");
        System.out.println();



        //Ex02
        System.out.println("Ex02:");

        System.out.println(john.NAME);
        System.out.println(john.HEARTH.hearthbeat);
        System.out.println();



        //Ex03
        System.out.println("Ex03:");

        john.isAlive();
        john.HEARTH.hearthbeatOn();
        System.out.println();



        //Ex04
        System.out.println("Ex04:");

        System.out.println(john.HEARTH.PERSON.HEARTH.PERSON.HEARTH.PERSON.NAME);
        System.out.println(john.HEARTH.PERSON.HEARTH.PERSON.HEARTH.PERSON.HEARTH.hearthbeat);
        System.out.println();



        //Ex05
        System.out.println("Ex05:");

        john.HEARTH.hearthbeat = false;
        john.isAlive();
        System.out.println();

    }

    /*  Ex01 -  Veja a classe "Person" para entender a implementação. Aqui neste exemplo veja que só de
                instanciar um objeto pela classe "Person" ele já imprime no console algumas palavras
                que necessitam de métodos que estão nas classes "Person" e "Hearth. Mostrando que
                "Hearth" é totalmente dependente de "Person";
     */

    /*  Ex02 -  Neste exemplo podemos ver que o relacionamento funcionou, pois conseguimos colher os
                valores tanto do objeto de "Person" como do objeto de "Hearth";
     */

    /*  Ex03 -  Neste exemplo podemos ver que o relacionamento funcionou, pois conseguimos usar os
                métodos tanto de "Person" como de "Hearth" usando o mesmo objeto instancializador;
     */

    /*  Ex04 -  Este exemplo prova definitivamente que o relacionamento de "Person" e "Hearth" é
                1 para 1, pois podemos ficar migrando entre as classes usando dot notation que ainda
                assim conseguimos colher os valores de suas variáveis ou usar seus métodos;
     */

    /*  Ex05 -  Este exemplo é para mostrar que por mais que um relacionamento 1 para 1 seja forte
                por impedir que constantes sejam alteradas, ainda assim ele não é totalmente seguro
                pois podemos alterar outros valores da parte de fora, como estamos fazendo com
                a variável "hearthbeat", note que ao alterá-la para false, nos devolve a pessoa
                morta, sem batimentos cardíacos;
     */
}
