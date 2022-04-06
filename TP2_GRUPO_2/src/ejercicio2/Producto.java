package ejercicio2;

public class Producto {

	private String fechaCaducidad;
	private int nroLote;
	
	
	public Producto() {	
	}
	
	public Producto(String fechaCaducidad, int nroLote) {
		this.fechaCaducidad = fechaCaducidad;
		this.nroLote = nroLote;
	}
	
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getNroLote() {
		return nroLote;
	}
	public void setNroLote(int nroLote) {
		this.nroLote = nroLote;
	}

	@Override
	public String toString() {
		return "Producto [fechaCaducidad=" + fechaCaducidad + ", nroLote=" + nroLote + "]";
	}
	
}
