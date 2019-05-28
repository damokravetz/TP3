package edu.ort.taller.ejer3;

public class Mascota {
	private String nombre;
	private String tipoAnimal;
	
	public Mascota(String nombre, String tipoAnimal) {
		this.nombre = nombre;
		this.tipoAnimal = tipoAnimal;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
}
