package edu.ort.taller.ejer2;

public class NumeroTelefonico {
	private int caracteristica;
	private int numeroDeAbonado;
	private int codigoDePais;
	private TipoDeLinea tipoDeLinea;
	
	public NumeroTelefonico() {
		
	}

	public NumeroTelefonico(int codigoDePais, int caracteristica, int numeroDeAbonado, TipoDeLinea tipoDeLinea) {
		this.caracteristica = caracteristica;
		this.numeroDeAbonado = numeroDeAbonado;
		this.codigoDePais = codigoDePais;
		this.tipoDeLinea = tipoDeLinea;
	}
	
	public int getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(int caracteristica) {
		this.caracteristica = caracteristica;
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
		return "(+" + this.codigoDePais + ") " + this.caracteristica + "-" + this.numeroDeAbonado;
	}
}
