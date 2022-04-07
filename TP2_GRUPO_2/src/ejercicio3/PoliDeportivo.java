package ejercicio3;

public class PoliDeportivo implements IinstalacionDeportiva,Iedificio {

	private String nombre;
	
	
	public PoliDeportivo() {}
	
	public PoliDeportivo(String nombre) {
		this.nombre = nombre;
	}
	//METODO
	@Override
	public double getSuperficieEdificio() {
		// El return es de ejemplo
		
		return 1;
	}

	@Override
	public int getTipoInstalacion() {
		// El return es de ejemplo
		return 1;
		}
	//gets y sets
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//to string
	@Override
	public String toString() {
		return "PoliDeportivo [nombre=" + nombre + "]"+" Superficie del edificio " +this.getSuperficieEdificio() +"";
	}

	
	
	
}
