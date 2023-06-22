package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.Composition;

//Motor foi criado só para compor a classe Carro...
public class Motor {
    boolean on = false;
    double injectionFactor = 1;

    //Note que motor tem apenas 1 funcionalidade, gerar RPMs...
    int rpm(){
        if(!on){
            return 0;
        } else {
            return (int) Math.round(injectionFactor * 3000);
        }
    }

}
