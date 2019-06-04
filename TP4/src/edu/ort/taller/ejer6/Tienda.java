package edu.ort.taller.ejer6;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Tienda {
	private ArrayList<Libro>libros;
	private ArrayList<Cliente>clientes;
	private ArrayList<Pedido>pendientes;
	private ArrayList<Pedido>realizados;
	private ArrayList <Stock>stock;
	
	
	public Tienda() {
		pendientes=new ArrayList<Pedido>();
		realizados=new ArrayList<Pedido>();
		stock=new ArrayList<Stock>();
		clientes=new ArrayList<Cliente>();
		libros=new ArrayList<Libro>();
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
	public void agregarCliente(String nombre, String apellido,int dni,String mail, String direccion){
		clientes.add(new Cliente(nombre,apellido,dni,mail,direccion));
	}
	public void agregarLibro(Libro l){
		libros.add(l);
	}
	public void agregarPedido(int dni, String autor, String titulo, String editorial){
		int nro=pendientes.size()+realizados.size()+1;
		Calendar calendar;
		int fecha=123;
		pendientes.add(new Pedido(nro, fecha, buscarLibro( autor, titulo, editorial), buscarCliente(dni)));
	}
	private Cliente buscarCliente(int dni){
		Cliente c=null;
		int i=0;
		while(i<clientes.size()&&c==null){
			if(clientes.get(i).getDni()==dni){
				c=clientes.get(i);
			}
			i++;
		}
		return c;
	}
	private Libro buscarLibro(String autor, String titulo, String editorial){
		Libro l=null;
		int i=0;
		while(i<libros.size()&&l==null){
			Libro miLibro=libros.get(i);
			if(miLibro.getAutor().equals(autor)&&miLibro.getEditorial().equals(editorial)&&miLibro.getTitulo().equals(titulo)){
				l=miLibro;
			}
			i++;
		}
		return l;
	}
	
	
}
