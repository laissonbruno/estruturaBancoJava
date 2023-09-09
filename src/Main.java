public class Main {
    public static void main(String[] args) {
        Cliente laisson = new Cliente();
        laisson.setNome("Laisson");

        Conta cc = new ContaCorrente(laisson);
        Conta cp = new ContaPoupanca(laisson);

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtratos();
        cp.imprimirExtratos();
    }
}
