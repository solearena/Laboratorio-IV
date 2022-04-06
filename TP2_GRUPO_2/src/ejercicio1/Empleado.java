package ejercicio1;

public class Empleado {
	
	// ATRIBUTOS
	private final int id;
	private String nombre;
	private int edad;
	private static int cont = 1000;
	// private static int cont = 999; --> otra forma
	
	// CONSTRUCTORES
	public Empleado(){
		this.id = cont;
		cont++;
		this.nombre = "Sin nombre";
		this.edad = 99;
	}
	
	/* Si inicializamos cont en 999:
	public Empleado(){
		cont++;
		this.id = cont;
		this.nombre = "Sin nombre";
		this.edad = 99;
	}
	*/
	
	public Empleado(String nombre, int edad){
		this.id = cont;
		cont++;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	/* Si inicializamos cont en 999:
	 public Empleado(String nombre, int edad){
	 	cont++;
		this.id = cont;
		this.nombre = nombre;
		this.edad = edad;
	}
	 */
	
	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getId() {
		return id;
	}
	
	// METODO devuelveProximoId VERSION 1()
	
	public int devuelveProximoId() {
		return cont;
	}
	
	// METODO devuelveProximoId VERSION 2()
	
		public String devuelveProximoId2() {
			// int siguiente = cont + 1 (si inicializamos el cont en 999)
			return "El próximo ID será el " + cont; // si inicializamos el cont en 999, en vez de cont devolvemos la variable siguiente)
		}
	
	// METODO toString()

	@Override
	public String toString() {
		return "EMPLEADO: " + id + " - NOMBRE: " + nombre + " - EDAD: " + edad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (edad != other.edad)
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}

