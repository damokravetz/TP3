package edu.ort.taller.ejer1;

import java.util.ArrayList;

public class Persona {
	
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> numerosTelefono;
	private ArrayList<EMail> eMails;

	public Persona(String apellido, String nombre) {
		numerosTelefono = new ArrayList<NumeroTelefonico>();
		eMails = new ArrayList<EMail>();
	}
	
	public void agregarMail() {
		
	}
	
	public void agregarTelefono(){
		
	}
	
	public void agregarMascota() {
		
	}
}
