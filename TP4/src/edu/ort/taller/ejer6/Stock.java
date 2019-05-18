package edu.ort.taller.ejer6;

public class Stock {
	private Libro libro;
	private int stock;
	
	public Stock(Libro libro, int stock) {
		super();
		this.libro = libro;
		this.stock = stock;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
