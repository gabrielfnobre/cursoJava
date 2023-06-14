public class Jantar {
    public static void main(String[] args){

        Pessoa pessoa = new Pessoa("Gabriel", 105);
        Comida comida1 = new Comida("Macarrao", .3);
        Comida comida2 = new Comida("Lasanha", 1.2);

        comerComidas(pessoa, comida1, comida2);
        
    }
    
    static void comerComidas(Pessoa pessoa, Comida comida1, Comida comida2){
        System.out.printf("%s tinha %.1fkg antes de comer.\n", pessoa.nome, pessoa.peso);
        pessoa.comer(comida1);
        pessoa.comer(comida2);
        System.out.printf("Ele(a) comeu %s.\n", comida1.comida);
        System.out.printf("e também %s.\n", comida2.comida);
        System.out.printf("Depois de comer ficou com: %.1fkg.", pessoa.peso);
    }
}
