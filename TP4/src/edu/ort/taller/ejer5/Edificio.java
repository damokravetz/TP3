package edu.ort.taller.ejer5;

import java.util.ArrayList;

public class Edificio {
	private ArrayList<Vivienda>viviendas;
	public Edificio(ArrayList<Vivienda> viviendas) {
		this.viviendas=viviendas;
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
