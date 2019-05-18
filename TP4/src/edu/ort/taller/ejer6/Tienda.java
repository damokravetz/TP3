package edu.ort.taller.ejer6;

import java.util.ArrayList;

public class Tienda {
	private ArrayList<Pedido>pendientes;
	private ArrayList<Pedido>realizados;
	private ArrayList <Stock>stock;
	public Tienda(ArrayList<Pedido> pendientes, ArrayList<Pedido> realizados, ArrayList<Stock> stock) {
		super();
		this.pendientes = pendientes;
		this.realizados = realizados;
		this.stock = stock;
	}
	public Tienda() {
		pendientes=new ArrayList<Pedido>();
		realizados=new ArrayList<Pedido>();
		stock=new ArrayList<Stock>();
	}
	public void addPedidoPendiente(Pedido p) {
		pendientes.add(p);
	}
	public void addPedidoRealizado(Pedido p) {
		realizados.add(p);
	}
	public void addStock(Stock s) {
		stock.add(s);
	}
	private Stock buscarStock(Libro l) {
		int i=0;
		Stock miStock=null;
		while(i<stock.size()&&miStock==null) {
			Libro libro=stock.get(i).getLibro();
			if(libro.getAutor().equals(l.getAutor())&&libro.getEditorial().equals(l.getEditorial())&&libro.getTitulo().equals(l.getTitulo())) {
				miStock=stock.get(i);
			}
			i++;
		}
		return miStock;
	}
	
	public void procesarPedidos() {
		Stock miStock;
		for(int i=0;i<pendientes.size();i++) {
			miStock=buscarStock(pendientes.get(i).getLibro());
			if(miStock!=null) {
				if(miStock.getStock()>0) {
					miStock.setStock(miStock.getStock()-1);
					realizados.add(pendientes.get(i));
					pendientes.remove(i);
				}
			}
		}
	}
	
	
}
