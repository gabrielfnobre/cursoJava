package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.Interfaces;

// Siga o código para ver como implementamos os membros das interfaces...

public class Ferrari implements Sportive, Luxury { //Temos que usar a palavra reservada implements para herdar os membros das interfaces, veja que estamos usando 2 interfaces em vez de uma.
    private Integer speed = 0;
    private Integer maxSpeed = MAX_SPEED; //Aqui temos a usabilidade de um dos atributos da interface Sportive...
    private Integer delta;
    private Boolean turbo = false;
    private Boolean air = false;

    public Integer getSpeed(){return speed;}
    public Integer getDelta(){return delta;}
    public Boolean getTurbo(){return turbo;}
    public void setTurbo(Boolean turbo) {
        this.turbo = turbo;
    }
    public Boolean getAir(){return air;}
    public void setAir(Boolean air) {
        this.air = air;
    }

    @Override                                   //Aqui começa uma das implementações de método, veja que o java nos
    public void turnOnTurbo(){                  //obriga da sobrescrever o método gerando uma implementação para ele.
        setTurbo(true);                         //Além disso, note que o método tem que estar público!
        System.out.println("Turbo is on!");
    };

    @Override                                   //Mais uma implementação
    public void turnOffTurbo(){
        setTurbo(false);
        System.out.println("Turbo is off!");
    };

    @Override                                   //Mais uma implementação
    public void turnOnAir(){
        setAir(true);
        System.out.println("Air is on!");
    };

    @Override                                   //Mais uma implementação
    public void turnOffAir(){
        setAir(false);
        System.out.println("Air is off!");
    };

    void accelerate(){                              //Um método para acelerar o carro, esse método acelerará o
        this.delta = deltaComparision();            //carro só até o limite do carro que foi definido na interface.
        if(speed < maxSpeed){                       //Além disso veja que chamamos um método que atribui valor ao
            speed += delta;                         //delta de aceleração do carro em comparação com o fato de o
            System.out.println("Speed: " + speed);  //turbo e o ar condicionado estarem ligados ou não...
        }else{
            System.out.println("The car arrives at your max speed!!!");
        }
    }

    void breaking(){                                //Um método de frenagem do carro, que só deixa o carro frear
        this.delta = deltaComparision();            //até chegar no valor zero. Além disso, veja que a força de
        if(speed > 0){                              //frenagem é influenciada pelo delta de aceleração...
            speed = ((speed - delta) < 0) ? 0 : (speed - delta);
            System.out.println("breaking (-" + delta + ")...");
        }else{
            System.out.println("Car is stopped...");
        }
    }

    Integer deltaComparision(){         //Aqui temos a implementação do atributo "COMUMN_DELTA", veja que ele era o
        if(turbo & !air){               //único membro que faltava das interfaces, todos os membros, sem excessão
            return 50;                  //devem ser implementados!
        }else if(turbo & air){          //Esse método compara se o turbo e o ar condicionado do carro estão ligados
            return 45;                  //passando valores diferentes para o delta de aceleração de acordo com o
        }else if(!turbo & !air){        //fato de o turbo e o ar estarem ligados ou não. Com o turbo e ar ligados
            return COMUMN_DELTA;        //a aceleração é mais fraca em relação a se nenhum ou apenas 1 dos dois está
        }else{                          //ligado...
            return COMUMN_DELTA - 5;
        }
    }

    //SIGA PARA A CLASSE AboutInterface PARA VER A INSTANCIALIZAÇÃO DE OBJETO E USABILIDADE DOS MÉTODOS...

}
