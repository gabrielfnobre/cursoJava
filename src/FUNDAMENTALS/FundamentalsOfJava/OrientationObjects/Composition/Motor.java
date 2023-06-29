package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.Composition;

//Motor foi criado só para compor a classe Carro...
public class Motor {

    /*  Aqui temos a linha que faz o carro ser uma composição 1 para 1, note que para um motor existir teremos que
    *   usar um método construtor lá embaixo que vai receber um objeto carro e vai atribuí-lo sobre a constante
    *   "CAR", fazendo com que aquele objeto específico só referencie a este motor e a nenhum outro, e ao mesmo
    *   tempo, olho como está o construtor da classe "Car", vc perceberá que ela também só pode referenciar a
    *   1 único motor e a nenhum outro...
    * */
    final Car CAR;
    boolean on = false;
    double injectionFactor = 1;

    Motor(Car car){
        this.CAR = car;
    }

    //Note que motor tem apenas 1 funcionalidade, gerar RPMs...
    int rpm(){
        if(!on){
            return 0;
        } else {
            return (int) Math.round(injectionFactor * 3000);
        }
    }

}
