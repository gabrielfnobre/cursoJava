package FUNDAMENTALS.FundamentalsOfJava.OrientationObjects.AboutSuper;

/*  Note aqui que estamos chamando especificamente o construtor padrão da SuperClasse
*   pois, estamos usando o super sem passar nenhum parâmetro.
*
*   Agora vá para a classe SubClassParams para ver como estamos refenciando o
*   construtor implementado da SuperClasse...
* */

public class SubClassComum extends SuperClassComum{
    SubClassComum(){
        super();
    }
}
