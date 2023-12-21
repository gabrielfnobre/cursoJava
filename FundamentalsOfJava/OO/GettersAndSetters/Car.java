package OO.GettersAndSetters;

/*  Note que aqui nessa classe temos alguns atributos onde vamos querer
*   proteger alguns e outros não...
* */

public class Car {
    private String name;    //Queremos proteger, afinal só queremos mudar o nome do carro se realmente precisar...
    private int speed = 0;  //Queremos proteger, pois só queremos que o carro acelere por através de um método...
    public String visualcaracterist; //Não precisa proteger, afinal qualquer pessoa pode dar características visuais a um carro...
    private int maxSpeed = 0; //Queremos proteger e só permitir que ela seja acessada por através de um método acessor...
    private int deltaSpeed = 0; //Queremos proteger e só permitir que seja acessada por através de método acessor...

    Car(String name){
        this.name = name;
    }
    //=========================== Aqui estão nossos métodos acessores getters e setters ============================
    public String getName() { //O get é usado por padrão quando queremos apenas visualizar o atributo...
        return name;
    }

    public void setName(String name) { //O set é usado por padrão quando queremos mudar o valor de atributo...
        this.name = name;
    }

    public int getSpeed() { //Note que speed tem apenas o get, pois queremos mudar a velocidade somente por
        return speed;       //através de aceleração...
    }

    public int getMaxSpeed() { //A velocidade máxima pode ser tanto visualizada quanto acessada...
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getDeltaSpeed() { //O delta de aceleração pode ser tanto visualizado quanto acessado...
        return deltaSpeed;
    }

    public void setDeltaSpeed(int deltaSpeed) {
        this.deltaSpeed = deltaSpeed;
    }

    //=============================================================================================================

    /*Temos aqui um método de aceleração que verifica se já designamos uma velocidade máxima para o carro,
    * se não, o método pede para designarmos uma velocidade máxima. Se a velocidade máxima estiver
    * definida ele pede para definirmos um delta de aceleração, caso contrário ele não acelera o carro.
    * Se o delta de aceleração estiver definido, ele acelera o carro sem passar da velocidade máxima que
    * foi definida.
    * */
    public void accelerate(){
        if(maxSpeed == 0){
            System.out.println("Max speed isn't assigned.");
        } else if(this.speed < maxSpeed){
            if(deltaSpeed >= 1){
                this.speed += deltaSpeed;
                System.out.println("Atual speed: " + this.speed);
            } else {
                System.out.println("Delta speed isn't assigned.");
            }
        } else {
            System.out.println("Max speed reach!");
        }
    }

    /*Aqui temos um método de frenagem, que freia o carro em relação ao delta de aceleração, se o carro
    * carro estiver em zero, ele mostra que o carro já está parado.
    * */
    public void breaking(){
        if(this.speed > 0){
            this.speed -= deltaSpeed;
            System.out.println("Breanking, atual speed: " + this.speed);
        } else {
            System.out.println("Car already stoped");
        }
    }

    //VOLTE AGORA PARA A CLASSE GettersAndSetters para ver a instancialização e usabilidade dos métodos acessores...
}
