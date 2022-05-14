
public abstract class Conta implements InterfaceConta {

	private static int SEQUENCIAL = 1;
	private static final int AGENCIA_PADRAO = 1;
	
	protected int agencia;
	protected int numeroConta;
	protected int saldo; 
	protected Cliente cliente;
	
	public Conta () {
		this.agencia = AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
	}
	
	@Override
	public void sacar(double valor) {
			this.saldo -= saldo;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += saldo;
	}

	@Override
	public void transferir(Conta contaDestino, double valor) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public int getSaldo() {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	protected void imprimirInfosComuns() {
		
		
		System.out.println("Cliente: "+ this.getCliente());
		System.out.println("Agencia: "+ this.agencia);
		System.out.println("Numero: "+ this.numeroConta);
		System.out.println("Saldo: "+ this.saldo);
	}
	
}
	
