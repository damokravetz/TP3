package edu.ort.taller.ejer3;

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
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	public void agregarMail(EMail eMail) {
		eMails.add(eMail);
	}
	
	public void agregarTelefono(NumeroTelefonico numeroTelefonico){
		numerosTelefono.add(numeroTelefonico);
	}
	
	public void agregarMascota(Mascota mascota) {
		mascotas.add(mascota);
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
		System.out.println("Mascotas:");
		for (Mascota mascota : mascotas) {
			System.out.println(mascota.getTipoAnimal() + ", " + mascota.getNombre());
		}
	}
}
