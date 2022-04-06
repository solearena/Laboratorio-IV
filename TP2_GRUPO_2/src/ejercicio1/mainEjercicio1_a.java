package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {
		
		ArrayList<Profesor>listaProfesores = new ArrayList<Profesor>(5);
		
		Profesor p1 =  new Profesor("Juan", 33, "Matematica", 10);
		Profesor p2 =  new Profesor("Mariela", 29, "Computación", 3);
		Profesor p3 =  new Profesor("Lucas", 36, "Lengua", 2);
		Profesor p4 =  new Profesor("Mariela", 40, "Ciencias Naturales", 4);
		Profesor p5 =  new Profesor("Marcos", 25, "Educación Física", 4);
		listaProfesores.add(p1);
		listaProfesores.add(p2);
		listaProfesores.add(p3);
		listaProfesores.add(p4);
		listaProfesores.add(p5);
		
		//Iterador
		ListIterator<Profesor>it = listaProfesores.listIterator();
		
		while(it.hasNext()) {
			Profesor profesor = it.next();
			System.out.println(profesor.toString());
		}
	}

}
