public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    public void imprimirExtratos(){
        System.out.println("=== Extrato conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
