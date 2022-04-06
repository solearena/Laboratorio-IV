package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		
		TreeSet<Profesor>listaProfesores2 = new TreeSet<Profesor>();
		
		Profesor p1 =  new Profesor("Juan", 33, "Matematica", 10);
		Profesor p2 =  new Profesor("Mariela", 29, "Computación", 3);
		Profesor p3 =  new Profesor("Lucas", 36, "Lengua", 2);
		Profesor p4 =  new Profesor("Mariela", 40, "Ciencias Naturales", 4);
		Profesor p5 =  new Profesor("Marcos", 25, "Educación Física", 4);
		listaProfesores2.add(p1);
		listaProfesores2.add(p2);
		listaProfesores2.add(p3);
		listaProfesores2.add(p4);
		listaProfesores2.add(p5);
		
		//Iterador
		
		for (Profesor profesor : listaProfesores2) {
			
			System.out.println(profesor.toString());
		}
		
		Profesor p6 = new Profesor("Carlos", 21, "DDHH", 2);
		Profesor p7 = new Profesor("Carlos", 21, "DDHH", 2);
		
		if (p6.equals(p7)) {
			System.out.println("\nSon el mismo profesor");
		}
		
	}

}


