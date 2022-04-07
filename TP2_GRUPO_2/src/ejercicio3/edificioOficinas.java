package ejercicio3;

public class edificioOficinas implements Iedificio {

	private int CantOficinas;
	
	
	edificioOficinas(){}
	
	edificioOficinas(int cant){
		this.CantOficinas = cant;
	}
	//metodo
	@Override
	public double getSuperficieEdificio() {
		// El return es de ejemplo
		return 1;
	}
	
	//gets y sets
	
	public int getCantOficinas() {
		return CantOficinas;
	}
	public void setCantOficinas(int cantOficinas) {
		CantOficinas = cantOficinas;
	}
	// to string 
	@Override
	public String toString() {
		return "edificioOficinas [CantOficinas=" + CantOficinas + "]";
	}



	


}
