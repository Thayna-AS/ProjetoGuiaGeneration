package domain;

import java.util.Scanner;

public class Menu {
	
	Scanner leia = new Scanner(System.in);
	
	
	protected String pedido;
	protected int valor;
	
	
	public Menu(Scanner leia, String pedido, int valor) {
		super();
		this.leia = leia;
		this.pedido = pedido;
		this.valor = valor;
	}
	public Scanner getLeia() {
		return leia;
	}
	public void setLeia(Scanner leia) {
		this.leia = leia;
	}
	public String getPedido() {
		return pedido;
	}
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
