package edu.ort.taller.ejer3;

public class EMail {
	private String cuenta;
	private String dominio;

	public EMail(String eMail) {
		String[] mailArray = eMail.split("@", 2);
		this.cuenta = mailArray[0];
		this.dominio = mailArray[1];
	}
	
	public String getValor() {
		return cuenta + "@" + dominio;
	}
}
