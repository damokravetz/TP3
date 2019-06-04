package edu.ort.taller.ejer1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona a = new Persona("Messi", "Lionel");
		EMail eMail1 = new EMail("lio@messi.com");
		NumeroTelefonico numeroTelefonico1 = new NumeroTelefonico(549, 114111, 2222, TipoDeLinea.CELULAR);
		NumeroTelefonico numeroTelefonico2 = new NumeroTelefonico(68, 032444, 5678, TipoDeLinea.CELULAR);
		NumeroTelefonico numeroTelefonico3 = new NumeroTelefonico(54, 4411, 5472, TipoDeLinea.FIJO);
		a.agregarMail(eMail1);
		a.agregarTelefono(numeroTelefonico1);
		a.agregarTelefono(numeroTelefonico2);
		a.agregarTelefono(numeroTelefonico3);
		a.mostrarTodo();
		
	}

}
