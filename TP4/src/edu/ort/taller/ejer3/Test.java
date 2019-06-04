package edu.ort.taller.ejer3;

public class Test {

	public static void main(String[] args) {
		
		Persona a = new Persona("Messi", "Lionel");
		EMail eMail1 = new EMail("lio@messi.com");
		EMail eMail2 = new EMail("liomessi_newells@hotmail.com");
		NumeroTelefonico numeroTelefonico1 = new NumeroTelefonico(549, 114111, 2222, TipoDeLinea.CELULAR);
		NumeroTelefonico numeroTelefonico2 = new NumeroTelefonico(68, 032444, 5678, TipoDeLinea.CELULAR);
		NumeroTelefonico numeroTelefonico3 = new NumeroTelefonico(54, 4411, 5472, TipoDeLinea.FIJO);
		Mascota mascota1 = new Mascota("Pluto", "Perro");
		Mascota mascota2 = new Mascota("Felix", "Gato");
		Mascota mascota3 = new Mascota("Bugs", "Conejo");
		Hito hito = new Hito("30/07/2014", "Ganar Mundial");
		Hito hito2 = new Hito("25/06/2018", "Ganar Balon de oro");
		Persona personaHito = new Persona("Higuain", "Gonzalo");
		Persona personaHito2 = new Persona("Aguero", "Sergio");
		hito.agregarPersonasInvolucradas(personaHito);
		hito.agregarPersonasInvolucradas(personaHito2);
		a.agregarMail(eMail1);
		a.agregarMail(eMail2);
		a.agregarTelefono(numeroTelefonico1);
		a.agregarTelefono(numeroTelefonico2);
		a.agregarTelefono(numeroTelefonico3);
		a.agregarMascota(mascota1);
		a.agregarMascota(mascota2);
		a.agregarMascota(mascota3);
		a.agregarhito(hito);
		a.agregarhito(hito2);
		a.mostrarTodo();
	}

}
