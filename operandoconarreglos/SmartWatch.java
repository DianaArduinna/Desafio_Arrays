package operandoconarreglos;

import java.util.ArrayList;

public class SmartWatch {

	public static void main(String[] args) {

		ArrayList<Integer> numpasos = new ArrayList<Integer>();
		int i;

		for (i = 0; i < args.length; i++) {
			numpasos.add(Integer.parseInt(args[i])); // transforma info de String a Int

		}
		// System.out.println(clearSteps(numpasos)); // muestra los arreglos filtrados

		System.out.println("El promedio de pasos es:");
		System.out.println(promedio(clearSteps(numpasos)));

	}// llave del main

	// metodo filtro

	static ArrayList<Integer> clearSteps(ArrayList<Integer> filtro) {

		ArrayList<Integer> numfiltro = new ArrayList<Integer>(); // array que recibe
		for (int i = 0; i < filtro.size(); i++) {
			if (filtro.get(i) > 200 && filtro.get(i) < 100000) { // los va filtrando
				numfiltro.add(filtro.get(i));
			}

		}

		return numfiltro;

	} // cierre metodo filtro

	static Integer promedio(ArrayList<Integer> prom) { // le decimos que vamos a recibir una entrada

		int acum = 0;
		int n = prom.size();

		// desarrollo

		for (int i = 0; i < prom.size(); i++) {

			acum = acum + prom.get(i);

		}
		int promedio = acum / n; // Puedes hacerlo de esta forma
		return promedio;
	}

}
