public class Main {
    public static void main(String[] args) throws Exception {
		Cliente cliente = new Cliente();
		cliente.setNome("Cliente 01");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
