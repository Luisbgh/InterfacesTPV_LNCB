package Modelo;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JList;

public class Comanda {

	private ArrayList<Mesa>mesas;

	public Comanda(ArrayList<Mesa> mesas) {
		this.mesas = mesas;
	}

	public ArrayList<Mesa> getMesas() {
		return mesas;
	}

	public void setMesas(ArrayList<Mesa> mesas) {
		this.mesas = mesas;
	}


	@Override
	public String toString() {
		return "Comanda [mesas=" + mesas + "]";
	}//toString
	
}//Comanda
