package domain.model;

public class Cardapio {

	private int pedido, numero, valor, quantidade;
	
	
	public void mostra() {
			System.out.println("****************************");
			System.out.println("           PEDIDO           ");
			System.out.println("****************************");
			System.out.println("Seu pedido contém:          ");
			System.out.println("\n");
	}

	
	public Cardapio(int pedido, int valor, int quantidade) {
		this.pedido = pedido;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public int getPedido() {
		return pedido;
	}

	public void setPedido(int pedido) {
		this.pedido = pedido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
