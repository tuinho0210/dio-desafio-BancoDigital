
public class Main {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Mônica");
		Cliente c2 = new Cliente("Magali");
		Cliente c3 = new Cliente("Chico");
		Cliente c4 = new Cliente("Cebolinha");
		Cliente c5 = new Cliente("Cascão");
		
		Conta co1 = new ContaCorrente();
		Conta co2 = new ContaPoupanca();
		Conta co3 = new ContaPoupanca();
		Conta co4 = new ContaPoupanca();
		Conta co5 = new ContaPoupanca();
		Conta co6 = new ContaPoupanca();
				
		c1.setContaCliente(co1);
		c2.setContaCliente(co2);
		c3.setContaCliente(co3);
		c4.setContaCliente(co4);
		c5.setContaCliente(co5);
		c1.setContaCliente(co6);
		
		co1.depositar(200);
		co1.transferir(co2, 100);
		
		c1.imprimirInfoCliente();
		co1.imprimirExtrato();
		
		c2.imprimirInfoCliente();
		co2.imprimirExtrato();
		
		Cliente.imprimirListaClientes();
		
	}

}
