package Modelo;

public class Producto {

	private String id, nombre, foto, stock, proveedor, tipo;
	private double precio;

	public Producto(String id, String nombre, String foto, double precio, String stock, String proveedor, String tipo) {
		this.id = id;
		this.nombre = nombre;
		this.foto = foto;
		this.precio = precio;
		this.stock = stock;
		this.proveedor = proveedor;
		this.tipo=tipo;
	}//Producto

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", foto=" + foto + ", precio=" + precio + ", stock="
				+ stock + ", proveedor=" + proveedor + ", tipo=" + tipo + "]";
	}//toString

}//Producto
