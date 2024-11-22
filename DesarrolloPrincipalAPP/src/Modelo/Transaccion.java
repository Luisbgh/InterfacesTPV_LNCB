package Modelo;

public class Transaccion {

	private String concepto;
	private int id;
	private double cantidad;
	private String tipo;
	
	public Transaccion(int id, String concepto, double cantidad, String tipo) {
		this.concepto=concepto;
		this.cantidad=cantidad;
		this.id=id;
		this.tipo=tipo;
	}//Transaccion

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Transaccion [concepto=" + concepto + ", id=" + id + ", cantidad=" + cantidad + "]";
	}//toString

}//Transaccion
