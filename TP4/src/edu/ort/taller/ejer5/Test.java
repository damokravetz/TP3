package edu.ort.taller.ejer5;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Persona persona0=new Persona("Arturo","Roman",53);
		Persona persona1=new Persona("Mónica","Gaztambide",35);
		Mueble mueble0=new Mueble("Mesa","Madera","Marron");
		Mueble mueble1=new Mueble("Mesada","Marmol","Rojo");
		Mueble mueble2=new Mueble("Perchero","Metal","Negro");
		Mueble mueble3=new Mueble("Sillon","Cuero","Azul");
		ArrayList<Mueble>muebles=new ArrayList<Mueble>();
		muebles.add(mueble0);
		muebles.add(mueble1);
		muebles.add(mueble2);
		muebles.add(mueble3);
		ArrayList<Persona>personas=new ArrayList <Persona>();
		personas.add(persona0);
		personas.add(persona1);
		/*Vivienda vivienda0=new Vivienda("Montañeses",1234,4,"C", personas, muebles);
		Vivienda vivienda1=new Vivienda("Montañeses",1234,2,"B",new ArrayList<Persona>(),new ArrayList<Mueble>());
		ArrayList<Vivienda>viviendas=new ArrayList<Vivienda>();
		viviendas.add(vivienda0);
		viviendas.add(vivienda1);*/
		Edificio edificio=new Edificio("Montañeses",1234,5,3);
		edificio.agregarPersonasDepto(personas, 4,"C");
		edificio.agregarMueblesDepto(muebles, 4,"C");
		for(int i=0;i<edificio.getViviendas().size();i++) {
			System.out.println(edificio.getViviendas().get(i).info(i+1));
		}
		edificio.realizarMudanza(4, "C", 2, "B");
		for(int i=0;i<edificio.getViviendas().size();i++) {
			System.out.println(edificio.getViviendas().get(i).info(i+1));
		}
	}

}
