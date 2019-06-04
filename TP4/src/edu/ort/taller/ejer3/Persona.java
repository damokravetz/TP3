package edu.ort.taller.ejer3;

import java.util.ArrayList;

public class Persona {
	
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> numerosTelefono;
	private ArrayList<EMail> eMails;
	private ArrayList<Mascota> mascotas;
	private ArrayList<Hito> hitos;

	public Persona(String apellido, String nombre) {
		numerosTelefono = new ArrayList<NumeroTelefonico>();
		eMails = new ArrayList<EMail>();
		mascotas = new ArrayList<Mascota>();
		hitos = new ArrayList<Hito>();
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	public void agregarMail(EMail eMail) {
		this.eMails.add(eMail);
	}
	
	public void agregarTelefono(NumeroTelefonico numeroTelefonico){
		this.numerosTelefono.add(numeroTelefonico);
	}
	
	public void agregarMascota(Mascota mascota) {
		this.mascotas.add(mascota);
	}
	
	public void agregarhito(Hito hito) {
		this.hitos.add(hito);
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public ArrayList<NumeroTelefonico> getNumerosTelefono() {
		return numerosTelefono;
	}

	public void setNumerosTelefono(ArrayList<NumeroTelefonico> numerosTelefono) {
		this.numerosTelefono = numerosTelefono;
	}

	public ArrayList<EMail> geteMails() {
		return eMails;
	}

	public void seteMails(ArrayList<EMail> eMails) {
		this.eMails = eMails;
	}

	public ArrayList<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(ArrayList<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	public ArrayList<Hito> getHitos() {
		return hitos;
	}

	public void setHitos(ArrayList<Hito> hitos) {
		this.hitos = hitos;
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
		System.out.println("Hitos:");
		for (Hito hito : hitos) {
			System.out.println("---------------------------------");
			System.out.println(hito.getDescripcion());
			System.out.println("Fecha del hito: " + hito.getFecha());
			if (!hito.getPersonasInvolucradas().isEmpty()) {
				System.out.println("Personas Involucradas: ");
				for (Persona persona : hito.getPersonasInvolucradas()) {
					System.out.println(persona.getApellido() + ", " + persona.getNombre());
				}
			}
		}
	}
}
