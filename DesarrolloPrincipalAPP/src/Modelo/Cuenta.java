package Modelo;

import java.util.ArrayList;

public class Cuenta {

	private ArrayList<Transaccion>transacciones;
	private String contraseña, nombre;
	private Double saldo;
	
	public Cuenta(String nombre, String contraseña, double saldo) {
		this.contraseña=contraseña;
		this.nombre=nombre;
		this.transacciones=new ArrayList<Transaccion>();
		this.saldo=saldo;
	}//Cuenta

	public ArrayList<Transaccion> getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(ArrayList<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [contraseña=" + contraseña + "]";
	}//toString
	
}//Cuenta
