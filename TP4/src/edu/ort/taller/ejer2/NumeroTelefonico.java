package edu.ort.taller.ejer2;

public class NumeroTelefonico {
	private int característica;
	private int numeroDeAbonado;
	private int codigoDePais;
	private TipoDeLinea tipoDeLinea;
	
	public NumeroTelefonico() {
		
	}

	public NumeroTelefonico(int característica, int numeroDeAbonado, int codigoDePais, TipoDeLinea tipoDeLinea) {
		this.característica = característica;
		this.numeroDeAbonado = numeroDeAbonado;
		this.codigoDePais = codigoDePais;
		this.tipoDeLinea = tipoDeLinea;
	}
	
	public int getCaracterística() {
		return característica;
	}
	public void setCaracterística(int característica) {
		this.característica = característica;
	}
	public int getNumeroDeAbonado() {
		return numeroDeAbonado;
	}
	public void setNumeroDeAbonado(int numeroDeAbonado) {
		this.numeroDeAbonado = numeroDeAbonado;
	}
	public int getCodigoDePais() {
		return codigoDePais;
	}
	public void setCodigoDePais(int codigoDePais) {
		this.codigoDePais = codigoDePais;
	}
	public TipoDeLinea getTipoDeLinea() {
		return tipoDeLinea;
	}
	public void setTipoDeLinea(TipoDeLinea tipoDeLinea) {
		this.tipoDeLinea = tipoDeLinea;
	}
	
	public String getValor() {
		return "(+" + this.codigoDePais + ") " + this.característica;
	}
}
