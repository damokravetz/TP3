package edu.ort.taller.ejer5;

import java.util.ArrayList;

public class Edificio {
	private ArrayList<Vivienda>viviendas;
	private String calle;
	private int altura;
	public Edificio(String calle, int direccion, int pisos, int deptos) {
		this.calle=calle;
		this.altura=direccion;
		this.viviendas=new ArrayList<Vivienda>();
		for(int i=0;i<(pisos);i++){
			for(int o=0;o<deptos;o++){
				this.viviendas.add(new Vivienda(calle, direccion,i,Deptos.values()[o].name()));
			}
		}
	}
	void agregarMueblesDepto(ArrayList<Mueble>muebles,int piso, String depto){
		Vivienda v=buscarVivienda(piso, depto);
		if(v!=null){
			v.setMuebles(muebles);
			System.out.println("Muebles establecidos");
		}else{
			System.out.println("Muebles no establecidos, no se encontro la vivienda");
		}
	}
	void agregarPersonasDepto(ArrayList<Persona>personas,int piso, String depto){
		Vivienda v=buscarVivienda(piso, depto);
		if(v!=null){
			v.setPersonas(personas);
			System.out.println("Personas establecidas");
		}else{
			System.out.println("Personas no establecidas, no se encontro la vivienda");
		}
	}
	public void realizarMudanza(int piso1, String depto1, int piso2, String depto2) {
		Vivienda v1=buscarVivienda(piso1, depto1);
		Vivienda v2=buscarVivienda(piso2, depto2);
		if(v1!=null&&v2!=null) {
			v2.setMuebles(v1.getMuebles());
			v2.setPersonas(v1.getPersonas());
			v1.setMuebles(new ArrayList<Mueble>());
			v1.setPersonas(new ArrayList<Persona>());
			System.out.println("SE HA REALIZADO LA MUDANZA DE VIVIENDA 1 A VIVIENDA 2");	
		}else{
			System.out.println("NO SE HA REALIZADO LA MUDANZA, NO SE HA ENCONTRADO UNA VIVIENDA");
		}
		
		
	}
	private Vivienda buscarVivienda(int piso, String depto) {
		int i=0;
		Vivienda miVivienda=null;
		while(i<viviendas.size()&&miVivienda==null) {
			if(viviendas.get(i).getDireccion().getPiso()==piso&&viviendas.get(i).getDireccion().getDepto().equals(depto)) {
				miVivienda=viviendas.get(i);
			}
			i++;
		}
		return miVivienda;
	}
	public ArrayList<Vivienda> getViviendas() {
		return viviendas;
	}
	public void setViviendas(ArrayList<Vivienda> viviendas) {
		this.viviendas = viviendas;
	}
	
}
