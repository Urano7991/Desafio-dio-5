public class main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(100);

        Conta poupanca = new ContaPupança();

        cc.transferir(100, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
