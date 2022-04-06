package ejercicio2;


public class ProductoRefrigerado extends Producto {

	private String codigoSA;

	public ProductoRefrigerado() {
		super();
	}

	public ProductoRefrigerado(String fechaCaducidad, int nroLote, String codigo) {
		super(fechaCaducidad, nroLote);
		this.codigoSA = codigo;
	}

	public String getCodigoSA() {
		return codigoSA;
	}

	public void setCodigoSA(String codigoSA) {
		this.codigoSA = codigoSA;
	}

	@Override
	public String toString() {
		return super.toString()+ ", Producto Refrigerado [codigoSA=" + codigoSA + "]";
	}
	
	
}
