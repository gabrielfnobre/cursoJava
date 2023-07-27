package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.FundamentalsOfPOO.PillarsOfPOO.GettersAndSetters;

//  GETTERS E SETTERS:

/*  Getters e Setters são o que chamamos de métodos acessores. Para que servem?
*   Os métodos acessores partem do conceito de encapsulamento, de que um código
*   precisa estar bem resgardado contra alterações indevidas.
*
*   Já vimos que os modificadores de acesso como "private", "protected" e
*   "package" fazem a proteção do nosso código, eles impedem que um
*   desenvolvedor desavisado faça alterações em atributos que não devem, é
*   como se dissesse "aqui você deve tomar cuidado".
*
*   Porém, eventualmente, vamos precisar acessar alguns atributos privados do
*   nosso código para fazer alterações, atualizações e mudanças de padrão.
*
*   Para isso foi padronizado o que chamamos de métodos acessores, eles
*   garantem que os atributos da nossa classe continuem seguros não podendo
*   ser acessados de qualquer maneira. Pois para acessá-los será necessário
*   usar o método acessor para fazer isso.
*
*   Vá para a classe "Car" desse pacote, para ver a implementação...
* */
public class GettersAndSetters {
    public static void main(String[] args) {

        Car car = new Car("Civic");

        System.out.println();
        System.out.println(car.getName()); //Não podemos acessar o nome que foi dado ao carro diretamente, só por através do getter...

        car.setName("Ferrari"); //Só podemos mudar o nome do carro por através do setter...
        System.out.println(car.getName());

        car.visualcaracterist = "dirty"; //Caracteristicas visuais do carro qualquer um pode atribuir...
        System.out.println();
        System.out.println("Visual caracterisc of the car: " + car.visualcaracterist);

        System.out.println("Atual speed: " + car.getSpeed()); //A velocidade só pode ser visualizada, só poderá ser atribuída por através do método de aceleração...
        car.accelerate(); //O carro não acelera sem uma velocidade máxima definida...
        car.breaking(); //O carro não pode frear se já está parado...
        System.out.println();

        car.setMaxSpeed(350); //Podemos designar uma velocidade máxima ao carro usando o setter...
        System.out.println("Max speed assigned: " + car.getMaxSpeed()); //Podemos ver a velocidade máxima usando o getter...
        car.accelerate(); //Não podemos acelerar se o delta de aceleração não tiver sido definido...
        System.out.println();

        car.setDeltaSpeed(50); //Para definir o delta de aceleração temos que usar o setter...
        System.out.println("Delta (factor aceleration): " + car.getDeltaSpeed()); //Para visualizar o método de aceleração temos que usar o getter...

        car.accelerate();car.accelerate();car.accelerate();car.accelerate(); // Com a velocidade máxima e delta de
        car.accelerate();car.accelerate();car.accelerate();car.accelerate(); // aceleração definidos podemos acelerar
                                                                             // até o limite

        System.out.println();
        car.breaking();car.breaking();car.breaking();car.breaking();car.breaking();car.breaking();car.breaking();
        car.breaking(); // Podemos frear até o carro parar...

    }
}
