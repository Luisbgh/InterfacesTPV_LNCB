package Modelo;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JList;

public class Comanda {

	private ArrayList<Mesa>mesas;
	private HashMap<String, Integer>historial;

	public Comanda(ArrayList<Mesa> mesas) {
		this.mesas = mesas;
		this.historial=historial;
	}

	public ArrayList<Mesa> getMesas() {
		return mesas;
	}

	public void setMesas(ArrayList<Mesa> mesas) {
		this.mesas = mesas;
	}

	public HashMap<String, Integer> getHistorial() {
		return historial;
	}

	public void setHistorial(HashMap<String, Integer> historial) {
		this.historial = historial;
	}

	@Override
	public String toString() {
		return "Comanda [mesas=" + mesas + ", historial=" + historial + "]";
	}
	
	
}//Comanda
