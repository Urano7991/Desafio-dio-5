public class ContaPupança extends Conta {
    
    @Override
    public void imprimirExtrato() {
        System.out.println("***Extrato conta Poupança***");
        super.impInfoComum();
    } 

    private static int SEQUENCIAL = 1;

    public ContaPupança() {
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++; 
    } 
}
