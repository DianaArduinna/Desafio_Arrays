package operandoconarreglos;

import java.util.ArrayList;

public class Visitas {

	public static void main(String[] args) { // recibo los argumentos

		ArrayList<Integer> numvisitas = new ArrayList<Integer>();

		for (int i = 0; i < args.length; i++) { // recorrer el arreglo
			numvisitas.add(Integer.parseInt(args[i])); // vamos a transformar la info porque estamos recibiendo strings
														// y los pasamos a int

		}
		System.out.println(promedio(numvisitas)); // llamamos al metodo y colocamos el arreglo que coloque en main

	}

	// Crear metodo

	static Integer promedio(ArrayList<Integer> visitas) { // le decimos que vamos a recibir una entrada

		int acum = 0;
		int n = visitas.size();

		// desarrollo

		for (int i = 0; i < visitas.size(); i++) {

			acum = acum + visitas.get(i);

		}
		int promedio = acum / n; // Puedes hacerlo de esta forma
		return promedio;
	}
}