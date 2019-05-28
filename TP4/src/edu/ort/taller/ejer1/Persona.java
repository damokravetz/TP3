package edu.ort.taller.ejer1;

import java.util.ArrayList;
import java.util.Iterator;

public class Persona {
	
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> numerosTelefono;
	private ArrayList<EMail> eMails;

	public Persona(String apellido, String nombre) {
		numerosTelefono = new ArrayList<NumeroTelefonico>();
		eMails = new ArrayList<EMail>();
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	public void agregarMail(EMail eMail) {
		eMails.add(eMail);
	}
	
	public void agregarTelefono(NumeroTelefonico numeroTelefonico){
		numerosTelefono.add(numeroTelefonico);
	}
	
	public void mostrarTodo() {
		System.out.println(apellido + ", " + nombre + "\n" +
				"Telefonos:");
		for (NumeroTelefonico numeroTelefonico : numerosTelefono) {
			System.out.println(numeroTelefonico.getTipoDeLinea() + ": " + numeroTelefonico.getValor());
		}
		System.out.println("Emails: ");
		for (EMail eMail : eMails) {
			System.out.println(eMail.getValor());
		}
	}
}
