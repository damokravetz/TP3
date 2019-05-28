package edu.ort.taller.ejer1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona a = new Persona("Di Napoli", "Leandro");
		EMail eMail1 = new EMail("lalala@gmail.com");
		EMail eMail2 = new EMail("jejejeje@gmail.com");
		EMail eMail3 = new EMail("jijijiji@gmail.com");
		NumeroTelefonico numeroTelefonico1 = new NumeroTelefonico(0541223, 10, 1, TipoDeLinea.CELULAR);
		NumeroTelefonico numeroTelefonico2 = new NumeroTelefonico(6661251, 12, 54, TipoDeLinea.FAX);
		NumeroTelefonico numeroTelefonico3 = new NumeroTelefonico(0512514, 10, 32, TipoDeLinea.FIJO);
		a.agregarMail(eMail1);
		a.agregarMail(eMail2);
		a.agregarMail(eMail3);
		a.agregarTelefono(numeroTelefonico1);
		a.agregarTelefono(numeroTelefonico2);
		a.agregarTelefono(numeroTelefonico3);
		a.mostrarTodo();
		
	}

}
