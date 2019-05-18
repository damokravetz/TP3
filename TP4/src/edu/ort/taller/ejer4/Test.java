package edu.ort.taller.ejer4;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

			Direccion direccion=new Direccion("Montañeses",1234,4,"C");
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
			Vivienda vivienda=new Vivienda(direccion, personas, muebles);
			System.out.println(vivienda.info(1));
			
			

	}

}
