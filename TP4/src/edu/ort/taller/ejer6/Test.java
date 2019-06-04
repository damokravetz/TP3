package edu.ort.taller.ejer6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tienda miTienda=new Tienda();
		miTienda.agregarCliente("Juan", "Perez", 29473648, "juanperez@gmail.com", "Av callao 253");
		Libro l=new Libro("Gabriel Garcia Marquez", "100 años de soledad", "Planeta");
		miTienda.agregarLibro(l);
		miTienda.agregarPedido(29473648, "Gabriel Garcia Marquez", "100 años de soledad", "Planeta");
		
	}

}
