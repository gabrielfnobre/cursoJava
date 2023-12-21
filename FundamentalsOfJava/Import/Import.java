package Import;

//IMPORT:

/*  O import no Java é uma ferramenta essencial para o programador, 
    é por através dela que nós temos acesso a funcionalidades, 
    valores, métodos e outras ferramentas disponíveis em outros 
    pacotes ou arquivos Java.

    A sintaxe dela é muito simples: "import caminho.do.arquivo"

    Somente com isso e já podemos ter acesso a todas as 
    funcionalidades de um pacote.

    Veja um exemplo abaixo...
 
 */

import java.util.Date;

public class Import {
 
    public static void main(String[] args){
        Date data = new Date();
        System.out.println(data);
    }

}
