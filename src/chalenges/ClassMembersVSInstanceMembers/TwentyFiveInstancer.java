public class TwentyFiveInstancer {
    public static void main(String[] args){
        
        //Ex01
        System.out.println(TwentyFiveOfDiscont.showDiscontValue());
        
        //Ex02
        TwentyFiveOfDiscont produto1 = new TwentyFiveOfDiscont("Notebook", 2000);
        System.out.println(produto1.seeProduct());

        //Ex03
        // System.out.println(TwentyFiveOfDiscont.seeProduct());

    }

    /*  Ex01 - Note que nem foi necessário gerar uma instância para chamar pelo método "showDiscontValue"
                pois ele é um método estático da classe;
    */

    /*  Ex02 - Já nesse nesse caso tivemos que primeiro instanciar um produto para poder chamar pelo 
                método "seeProduct", pois esse método pertence a instância e não a classe;
    */
    
    /*  Ex03 - Note que se tentarmos chamar pelo método "seeProduct" diretamente á partir da classe vamos
                ter um erro de compilação;
    */

}
