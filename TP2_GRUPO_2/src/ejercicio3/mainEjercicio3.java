package ejercicio3;
import java.util.ArrayList;
import java.util.Iterator;

import ejercicio1.Profesor;

public class mainEjercicio3 {

	public static void main(String[] args) {
		
		ArrayList<Iedificio> lista = new ArrayList<Iedificio>(5);
		
		PoliDeportivo pd1 = new PoliDeportivo("San Martin");
		PoliDeportivo pd2 = new PoliDeportivo("Belgrano");
		PoliDeportivo pd3 = new PoliDeportivo("San Pablo");
		edificioOficinas eo1 = new edificioOficinas(3);
		edificioOficinas eo2 = new edificioOficinas(7);
		
		lista.add(pd1);
		lista.add(pd2);
		lista.add(pd3);
		lista.add(eo1);
		lista.add(eo2);
		
		//Iterador
				Iterator<Iedificio>it = lista.iterator();
				
				while(it.hasNext()) {
					Iedificio ie = it.next();
					System.out.println(ie.toString());
					
				}
		

	}

}
