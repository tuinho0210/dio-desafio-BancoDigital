
public class Cliente {

	private String nomeCliente;
	private Conta contaCliente;
	

	public Cliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;

	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public Conta getContaCliente() {
		return contaCliente;
				
	}
	
	public void setContaCliente(Conta contaCliente) {
		this.contaCliente = contaCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void imprimirInfoCliente() {
		System.out.println(this.getClass().getName());
		System.out.println("Nome do cliente: " +this.getNomeCliente());
		System.out.println("Conta do cliente:" +this.getContaCliente());

	}
}
