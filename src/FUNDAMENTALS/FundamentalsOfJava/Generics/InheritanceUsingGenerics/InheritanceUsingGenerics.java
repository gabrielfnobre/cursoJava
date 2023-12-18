package FUNDAMENTALS.FundamentalsOfJava.Generics.InheritanceUsingGenerics;

public class InheritanceUsingGenerics {
    public static void main(String[] args) {

        BoxIntoTheBox<String> square = new BoxIntoTheBox<>(); //Só aceitará tipos String ou filhos...
        Box<Boolean> triangle = new Box<>(); //Aceita qualquer tipo...

        square.setMyThingInTheBox("quadrado");
        triangle.setMyThingInTheBox(true);

        System.out.println(square.getMyThingInTheBox());
        System.out.println(triangle.getMyThingInTheBox());

    }
}

/*      HERANÇA USANDO GENERICS:
*
*   Podemos usar generics mesmo com herança, isso é possível por passarmos para frente da
*   classe mãe a responsabilidade de implementar o tipo de dado.
*
*   Veja como podemos fazer isso, vá agora para a classe "Box"...
*
* */