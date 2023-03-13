package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Avion {
	private String codigoA;
	private String modelo;
	private int cantPasaje;
	private String color;
	private Boolean exito;


	public Avion(String codigoA, String modelo, int cantPasaje, String color, Boolean exito) {
		this.codigoA = codigoA;
		this.modelo = modelo;
		this.cantPasaje = cantPasaje;
		this.color = color;
		this.exito = exito;
	}

	public Boolean getExito() {
		return exito;
	}

	public void setExito(Boolean exito) {
		this.exito = exito;
	}

	public void setCodigoA(String codigoA) {
		this.codigoA = codigoA;
	}

	public String getCodigoA() {
		return codigoA;
	}

	public String getModelo() {
		return modelo;
	}

	public int getCantPasaje() {
		return cantPasaje;
	}

	public String getColor() {
		return color;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCantPasaje(int cantPasaje) {
		this.cantPasaje = cantPasaje;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void volar(){
		String mensaje = (exito==true) ? "vuelo exitoso":"error catastrófico";
		System.out.println(mensaje);
		System.out.println(this.codigoA + " " +this.modelo +" "+this.color +" "+this.cantPasaje);
	}

	public void aterrizar(){
		String mensaje = (exito == true)? "aterrizaje exitoso": "vuelo fatal";
		System.out.println(mensaje);
	}

	public void despegar(){
		String mensaje = (exito == true)? "despegue exitoso": "despegue fatal";
		System.out.println(mensaje);
	}

	public static void main(String[] args) {

		/*Avion avioncito =  new Avion("3", "comercial", 12, "celeste", true);
		avioncito.volar();
		avioncito.aterrizar();
		avioncito.despegar();
		Avion flyBondy = new Avion("6", "comercial", 20, "rojo", false);
		flyBondy.volar();
		flyBondy.aterrizar();
		flyBondy.despegar();*/
		American grande = new American("3", "comercial", 50, "negro", true);
		grande.volar();
		grande.aterrizar();
		grande.despegar();
		grande.cantVuelo(20);
		grande.cantVuelo(1.2);
		grande.cantVuelo(1.5, 7);
	}

}
