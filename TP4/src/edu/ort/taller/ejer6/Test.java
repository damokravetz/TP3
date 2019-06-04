package edu.ort.taller.ejer6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		Tienda miTienda=new Tienda();
		miTienda.agregarCliente("Juan", "Perez", 29473648, "juanperez@gmail.com", "Av callao 253");
		Libro l=new Libro("Gabriel Garcia Marquez", "100 años de soledad", "Planeta");
		miTienda.agregarLibro(l);
		miTienda.agrgarStock("Gabriel Garcia Marquez", "100 años de soledad", "Planeta", 10);
		miTienda.agregarPedido(29473648, "Gabriel Garcia Marquez", "100 años de soledad", "Planeta");
		miTienda.procesarPedidos();
		miTienda.informarPedidos();
		miTienda.informarStock();	
	}

}
