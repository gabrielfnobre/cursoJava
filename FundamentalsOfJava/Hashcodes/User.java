package Hashcodes;

/*  Veja na implementação abaixo que usamos o hashCode() junto a implementação do equals().
*   Esses dois métodos herdados de Object caminham juntos, se modificarmos o equals na
*   nossa classe, temos que modificar também o hasCode para que ele funcione adequadamente.
*/

public class User {
    String name;
    String email;

    User (String initialName, String initialEmail){
        name = initialName;
        email = initialEmail;
    }

    //Veja que o equals irá fazer a comparação com o valor de name...
    public int hashCode(){
        final int prime = 31;
        int result = 17;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    //equals irá comparar os valores de name e email de ambas instâncias...
    //ele possuí até um controle de erro para evitar que testes em argumentos que não
    //forem instâncias de User não sejam passados...
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
}
