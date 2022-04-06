package ejercicio2;



public class ProductoCongelado extends Producto{

	private int temperatura;

	public ProductoCongelado() {
		super();
	}

	public ProductoCongelado(String fechaCaducidad, int nroLote, int temperatura) {
		super(fechaCaducidad, nroLote);
		this.temperatura = temperatura;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return super.toString() + ". Producto Congelado [temperatura=" + temperatura + "]";
	}
	
	
	
}
