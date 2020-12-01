package operandoconarreglos;

import java.util.ArrayList;

public class MultiplosDeTres {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<Integer>();

		int i;

		for (i = 0; i < args.length; i++) {
			num.add(Integer.parseInt(args[i]));
		}

		// System.out.println(filtro(num));

		System.out.println(sumar(filtro(num)));
		System.out.println(promedio(filtro(num)));

	}// cierre main

	static ArrayList<Integer> filtro(ArrayList<Integer> numfiltro) {

		ArrayList<Integer> filtrado = new ArrayList<Integer>();

		for (int i = 0; i < numfiltro.size(); i++) {
			if (numfiltro.get(i) % 3 == 0) {
				filtrado.add(numfiltro.get(i));

			}
		}

		return filtrado;

		// Se debe crear el método suma, que reciba como parámetro
		// el arreglo con los valores a sumar y muestre por pantalla la suma

	}// cierre metodo filtro

	static Integer sumar(ArrayList<Integer> suma) {
		int acum = 0;

		// desarrollo

		for (int i = 0; i < suma.size(); i++) {

			acum = acum + suma.get(i);

		}

		return acum;

	}// cierre metedo suma

	static Integer promedio(ArrayList<Integer> multiplos) {

		int acum = 0;
		int n = multiplos.size();

		// desarrollo

		for (int i = 0; i < multiplos.size(); i++) {

			acum = acum + multiplos.get(i);

		}
		int promedio = acum / n;
		return promedio;
	}

}
