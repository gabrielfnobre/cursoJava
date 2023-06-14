public class crazyFormula {
    public static void main(String[] args){
        int primeiroDividendo = (int) Math.pow((6 * (3 + 2)), 2);
        int primeiraDivisao = primeiroDividendo / (3 * 2);
        int segundoDividendo = (int) (1 - 5) * (2 - 7);
        int segundaDivisao = (int) Math.pow(segundoDividendo / 2, 2);
        int terceiroDividendo = (int) Math.pow((primeiraDivisao - segundaDivisao), 3);
        int terceiroDivisor = (int) Math.pow(10, 3);
        int divisaoFinaaaaaaal = terceiroDividendo / terceiroDivisor;
        System.out.println(divisaoFinaaaaaaal);
    }
}
