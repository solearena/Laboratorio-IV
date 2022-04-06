package ejercicio2;


public class ProductoFresco extends Producto {
	private String fechaEnvasado;
	private String paisOrigen;
	
	public ProductoFresco() {
		super();
		
	}
	
	public ProductoFresco(String fechaCaducidad, int nroLote, String fechaEnvasado, String pais) {
		super(fechaCaducidad, nroLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = pais;
	}
	
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Producto Fresco [fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + "]";
	}
	
}
