package FUNDAMENTALS.FundamentalsOfJava.EqualsThe;

public class User {
    String name;
    String email;

    //Ex01
    public boolean equals(Object obj) {
        User other = (User) obj;
        if(other instanceof User){
            boolean isNameEqual = other.name.equals(this.name);
            boolean isEmailEqual = other.email.equals(this.email);
            return isNameEqual && isEmailEqual ? true : false;
        } else {
            return false;
        }
    }

    /*  EX 01 - Aqui temos a implementação do equals em uma classe, note que o equals receberá um 
                objeto, esse objeto será transformado em um objeto da classe por através do cast,
                na sequência temos uma validação if para checkar se o objeto realmente é uma 
                instância da classe. Depois, usamos o equals para comparar os atributos que 
                queremos comparar entre o objeto comparado e o comparando, essa comparação irá 
                retornar "true" ou "false" depedendo dos valores recebidos e comparados;
     */

}
