package edu.ort.taller.ejer5;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Direccion direccion0=new Direccion("Monta�eses",1234,4,"C");
		Direccion direccion1=new Direccion("Monta�eses",1234,2,"B");
		Persona persona0=new Persona("Arturo","Roman",53);
		Persona persona1=new Persona("M�nica","Gaztambide",35);
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
		Vivienda vivienda0=new Vivienda(direccion0, personas, muebles);
		Vivienda vivienda1=new Vivienda(direccion1,new ArrayList<Persona>(),new ArrayList<Mueble>());
		ArrayList<Vivienda>viviendas=new ArrayList<Vivienda>();
		viviendas.add(vivienda0);
		viviendas.add(vivienda1);
		Edificio edificio=new Edificio(viviendas);
		for(int i=0;i<edificio.getViviendas().size();i++) {
			System.out.println(edificio.getViviendas().get(i).info(i+1));
		}
		edificio.realizarMudanza(4, "C", 2, "B");
		for(int i=0;i<edificio.getViviendas().size();i++) {
			System.out.println(edificio.getViviendas().get(i).info(i+1));
		}
	}

}
