package edu.ort.taller.ejer6;

import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tienda miTienda=new Tienda();
		miTienda.agregarCliente("Juan", "Perez", 29473648, "juanperez@gmail.com", "Av callao 253");
		Libro l=new Libro("Gabriel Garcia Marquez", "100 a�os de soledad", "Planeta");
		miTienda.agregarLibro(l);
		miTienda.agregarPedido(29473648, "Gabriel Garcia Marquez", "100 a�os de soledad", "Planeta");
		System.out.println((Calendar.DATE*100000)+(Calendar.MONTH*10000)+(Calendar.YEAR));
		
	}

}
