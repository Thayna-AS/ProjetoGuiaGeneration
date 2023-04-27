package domain;

import java.util.Scanner;

public class Menu {
	
	
	Scanner read = new Scanner(System.in);
	
	
	protected String pedido;
	protected int op,valor;
	
	
	public Menu(Scanner read, String order, int op, int value) {
		super();
		this.read = read;
		this.pedido = order;
		this.op = op;
		this.valor = value;
	}
	public Scanner getRead() {
		return read;
	}
	public void setRead(Scanner read) {
		this.read = read;
	}
	public String getOrder() {
		return pedido;
	}
	public void setOrder(String order) {
		this.pedido = order;
	}
	public int getOp() {
		return op;
	}
	public void setOp(int op) {
		this.op = op;
	}
	public int getValue() {
		return valor;
	}
	public void setValue(int value) {
		this.valor = value;
	}
	
	
}
