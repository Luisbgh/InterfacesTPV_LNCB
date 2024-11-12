package Modelo;

import java.util.HashMap;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Mesa {

	private int id, comandaNum;
	private String fecha, hora;
	private HashMap<String, Integer>items;
	private boolean ocupado;
	private JList lista;
	private Double total;
	
	public Mesa(int id,String fecha, String hora) {
		this.id = id;
		this.comandaNum = comandaNum;
		this.total = 0.0;
		this.fecha = fecha;
		this.hora = hora;
		this.items = new HashMap<String, Integer>();
		this.ocupado = ocupado;
		this.lista = lista;
	}//Mesa

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getComandaNum() {
		return comandaNum;
	}

	public void setComandaNum(int comandaNum) {
		this.comandaNum = comandaNum;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public HashMap<String, Integer> getItems() {
		return items;
	}

	public void setItems(HashMap<String, Integer> items) {
		this.items = items;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public JList getLista() {
		return lista;
	}

	public void setLista(JList lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Mesa [id=" + id + ", comandaNum=" + comandaNum + ", total=" + total + ", fecha=" + fecha + ", hora="
				+ hora + ", items=" + items +  ", ocupado=" + ocupado + ", lista=" + lista + "]";
	}
	
}//Mesa