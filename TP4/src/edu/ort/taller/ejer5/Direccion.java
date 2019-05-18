package edu.ort.taller.ejer5;

public class Direccion {
private String calle;
private int altura;
private int piso;
private String depto;
public Direccion(String calle, int altura, int piso, String depto) {
	super();
	this.calle = calle;
	this.altura = altura;
	this.piso = piso;
	this.depto = depto;
}
public String getCalle() {
	return calle;
}
public void setCalle(String calle) {
	this.calle = calle;
}
public int getAltura() {
	return altura;
}
public void setAltura(int altura) {
	this.altura = altura;
}
public int getPiso() {
	return piso;
}
public void setPiso(int piso) {
	this.piso = piso;
}
public String getDepto() {
	return depto;
}
public void setDepto(String depto) {
	this.depto = depto;
}
@Override
public String toString() {
	return "Direccion [calle=" + calle + ", altura=" + altura + ", piso=" + piso + ", depto=" + depto + "]";
}
public String info() {
	return ""+calle+" "+altura+" "+piso+"°"+depto;
}
}