public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("***Extrato conta Corrente***");
        super.impInfoComum();
    } 

    private static int SEQUENCIAL = 1;

    public ContaCorrente() {
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++; 
    }
    
    
}
