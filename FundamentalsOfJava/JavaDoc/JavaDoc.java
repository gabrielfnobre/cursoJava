package JavaDoc;

//JAVADOC

/*  O Javadoc é uma ferramenta usada por desenvolvedores Java para agilizar a documentação
    de um programa. Por através dessa ferramenta, é possível gerar documentação usando o 
    próprio código fonte, e isso é feito por através de comentários especiais.
*/
//  O comentário do javadoc usa o seguinte formato: começa com "/**"  e termina com "*/"

/*  Esses comentários usam tags especificas que podem ser reconhecidas pelo java quando um
    comando javadoc for executado no terminal, esse reconhecimento gera a documentação 
    automaticamente em formato html.

    As tags mais usadas do javadocs e suas funcionalidades são:

        @author - usado para documentar o nome do autor. A tag inclui o nome do parâmetro 
                seguido pelo nome do author.

        @deprecated - usado para marcar um método, classe ou campo como obsoleto e informar 
                que ele não deve ser usado. A tag inclui uma mensagem informando o motivo da 
                obsolescência e sugestões de alternativas.

        @param - usado para documentar os parâmetros de um método ou construtor. A tag 
                inclui o nome do parâmetro seguido de uma descrição do que o parâmetro faz.

        @return - usado para documentar o valor de retorno de um método. A tag inclui uma 
                descrição do valor de retorno.

        @see - usado para fazer referência a outras classes, métodos ou campos relacionados. 
                A tag inclui o nome da classe, método ou campo referenciado.

        @since - usado para referenciar a data em que iniciou o projeto, na sua primeira 
                versão.

        @throws - usado para documentar as exceções que um método pode lançar. A tag inclui 
                o nome da exceção e uma descrição do que pode causar a exceção.

        @version - usado para documentar a versão atual em qua o programa declarado se 
                encontra.
 
    Para executar o comando javadoc e gerar a documentação do seu código Java, siga os 
    seguintes passos:

        1º - Certifique-se de que o JDK (Java Development Kit) está instalado em seu 
            computador. O javadoc é um utilitário incluído no JDK.

        2º - Escreva os comentários no seu código-fonte, usando o formato do JavaDoc.

        3º - Abra o terminal ou prompt de comando do seu sistema operacional e navegue 
            até o diretório onde está localizado o seu código-fonte e execute o comando 
            javadoc seguido das opções e dos arquivos de entrada. Por exemplo:

                        javadoc -d doc -author -version src/*.java

            Neste exemplo, o comando javadoc irá gerar a documentação para todos os 
            arquivos .java localizados na pasta src, e salvará a documentação gerada no 
            diretório doc. As opções -author e -version incluirão informações adicionais 
            na documentação gerada.

            Após a execução do comando, a documentação gerada será armazenada no diretório 
            especificado. Você pode abrir o arquivo "index.html" neste diretório com um 
            navegador para visualizar a documentação.

            Note que o comando javadoc suporta muitas outras opções para personalizar a 
            documentação gerada, incluindo a inclusão/exclusão de classes/métodos, 
            definição de tags personalizadas, definição de templates para a aparência da 
            documentação, entre outras. Você pode consultar a documentação do JDK para 
            obter mais informações sobre essas opções.

    Existe um exemplo real feito com esse arquivo, veja a pasta "doc" e abra o "index.html"
    você vai encontrar uma documentação gerada somente para este arquivo.

 */

/**
 * @author Gabriel F. Nobre <email@com>
 * @see Documentação adicional
 * @since 2023
 * @version 1.0
 * @param a o primeiro número
 * @param b o segundo número
 * @return A soma de a + b
 */

public class JavaDoc {
    public static void main(String[] args){
        
    }
}