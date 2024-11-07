package Modelo;

public class Empleado {

	private String nombre, contraseña, jornadaInicio, jornadaFinal, foto;
	private int sueldo;
	
	public Empleado(String nombre, String contraseña, String jornadaInicio, String jornadaFinal, int sueldo, String foto) {
		this.nombre=nombre;
		this.contraseña=contraseña;
		this.jornadaInicio=jornadaInicio;
		this.jornadaFinal=jornadaFinal;
		this.sueldo=sueldo;
		this.foto=foto;
		}//Empleado

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getJornadaInicio() {
		return jornadaInicio;
	}

	public void setJornadaInicio(String jornadaInicio) {
		this.jornadaInicio = jornadaInicio;
	}

	public String getJornadaFinal() {
		return jornadaFinal;
	}

	public void setJornadaFinal(String jornadaFinal) {
		this.jornadaFinal = jornadaFinal;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", contraseña=" + contraseña + ", jornadaInicio=" + jornadaInicio
				+ ", jornadaFinal=" + jornadaFinal + ", foto=" + foto + ", sueldo=" + sueldo + "]";
	}

}//Empleado
