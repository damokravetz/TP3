package edu.ort.taller.ejer6;

public class Pedido {
	private int nro;
	private String fechaCompra;
	private Libro libro;
	private Cliente cliente;
	public Pedido(int nro, String fechaCompra, Libro libro, Cliente cliente) {
		super();
		this.nro = nro;
		this.fechaCompra = fechaCompra;
		this.libro = libro;
		this.cliente = cliente;
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public String getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Pedido [nro=" + nro + ", fechaCompra=" + fechaCompra + ", libro=" + libro.toString() + ", cliente=" + cliente.toString()
				+ "]";
	}
	
}
