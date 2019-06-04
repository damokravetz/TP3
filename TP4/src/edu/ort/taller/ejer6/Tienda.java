package edu.ort.taller.ejer6;

import java.time.LocalDate;
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

	public void agrgarStock(String autor, String titulo, String editorial, int cant) {
		Libro l=buscarLibro(autor, titulo, editorial);
		if(l!=null){
			stock.add(new Stock(l,cant));
		}else{
			agregarLibro(new Libro(autor,titulo,editorial));
			l=buscarLibro(autor, titulo, editorial);
			stock.add(new Stock(l,cant));
		}
		
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
		LocalDate ldt = LocalDate.now();
		String fecha=""+ldt;
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
	public void informarPedidos(){
		System.out.println("Pendientes:");
		for(Pedido p:pendientes){
			System.out.println(p.toString());
		}
		System.out.println("Realizados:");
		for(Pedido p:realizados){
			System.out.println(p.toString());
		}
	}
	public void informarStock(){
		System.out.println("Stock:");
		for(Stock s:stock){
			System.out.println(s.toString());
		}
	}
	
}
