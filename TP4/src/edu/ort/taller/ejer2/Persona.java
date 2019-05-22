package edu.ort.taller.ejer2;

import java.util.ArrayList;

public class Persona {
	
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> numerosTelefono;
	private ArrayList<EMail> eMails;
	private ArrayList<Mascota> mascotas;

	public Persona(String apellido, String nombre) {
		numerosTelefono = new ArrayList<NumeroTelefonico>();
		eMails = new ArrayList<EMail>();
		mascotas = new ArrayList<Mascota>();
	}
	
	public void agregarMail() {
		
	}
	
	public void agregarTelefono(){
		
	}
	
	public void agregarMascota() {
		
	}
}
