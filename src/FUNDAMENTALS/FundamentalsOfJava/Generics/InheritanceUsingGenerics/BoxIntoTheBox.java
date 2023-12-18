package FUNDAMENTALS.FundamentalsOfJava.Generics.InheritanceUsingGenerics;

public class BoxIntoTheBox<T extends String> extends Box<T>{
}

/*  Note que essa classe é filha de "Box", note que poderíamos ter designado um tipo
*   para Box, mas não fizemos isso, em vez disso definimos um tipo genérico limitado
*   a ser sempre do tipo String ou filhos de String.
*
*   Isso significa que apesar de ser filha, a classe "BoxIntoTheBox" não pode receber
*   qualquer tipo de dado, como faria a sua classe mãe...
*
*   Vá agora para a classe "InheritanceUsingGenerics" para ver o restante da imple-
*   mentação...
*
* */