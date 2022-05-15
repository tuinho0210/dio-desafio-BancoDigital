import java.util.ArrayList;
import java.util.List;

public class Cliente {


	private String nomeCliente;
	private Conta contaCliente;
	private static List<String> lista = new ArrayList<>();

	public Cliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
		lista.add(this.nomeCliente);
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
	
	public static void imprimirListaClientes() {
		
		System.out.println("\nLista de clientes cadastrados:\n ");
		for (String nome : lista) {
		    System.out.println(nome);
		}           
	}                                           
	
	
	public void imprimirInfoCliente() {
		System.out.println("Nome do cliente: " + this.getNomeCliente());
		System.out.println("Numero da conta:" + contaCliente.getNumeroConta());
	}
}
