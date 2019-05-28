package edu.ort.taller.ejer4;

import java.util.ArrayList;

public class Vivienda {
private Direccion direccion;
private ArrayList<Persona> personas;
private ArrayList<Mueble> muebles;
public Vivienda(String calle, int direccion, int piso, String depto, ArrayList<Persona> personas, ArrayList<Mueble> muebles) {
	super();
	this.direccion = new Direccion(calle, direccion, piso, depto);
	this.personas = personas;
	this.muebles = muebles;
}
public Direccion getDireccion() {
	return direccion;
}
public void setDireccion(Direccion direccion) {
	this.direccion = direccion;
}
public ArrayList<Persona> getPersonas() {
	return personas;
}
public void setPersonas(ArrayList<Persona> personas) {
	this.personas = personas;
}
public ArrayList<Mueble> getMuebles() {
	return muebles;
}
public void setMuebles(ArrayList<Mueble> muebles) {
	this.muebles = muebles;
}
@Override
public String toString() {
	return "Vivienda [direccion=" + direccion + ", personas=" + personas + ", muebles=" + muebles + "]";
}
public String info(int n) {
	String res= "Vivienda: "+n+"\nDireccion: "+direccion.info()+"\nPersonas:\n";
	for(int i=0;i<personas.size();i++) {
		res=res+personas.get(i).info()+"\n";
	}
	res=res+"Muebles:\n";
	for(int i=0;i<muebles.size();i++) {
		res=res+muebles.get(i).info()+"\n";
	}
	return res;
}

}
