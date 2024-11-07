public class Main {
    public static void main(String[] args){

        Banco banco = new Banco();
        ContaCorrente corrente = new ContaCorrente(new Cliente("Mario"));
        ContaPoupanca poupanca = new ContaPoupanca(new Cliente("Alexandre"));


        banco.adicionarConta(corrente);
        banco.adicionarConta(poupanca);
    

        corrente.depositar(100);
        corrente.transferir(50, poupanca);

        corrente.imprimirExtrato();
        System.out.println();
        poupanca.imprimirExtrato();
    }
}
