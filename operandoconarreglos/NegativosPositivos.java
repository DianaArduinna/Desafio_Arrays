package operandoconarreglos;

import java.util.ArrayList;

public class NegativosPositivos {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		int i;

		for (i = 0; i < args.length; i++) {
			numeros.add(Integer.parseInt(args[i]));
		}
		System.out.println(contadores(numeros));

		// imprime el arreglo System.out.println(numeros);

	}// Cierre Main

	static ArrayList<Integer> contadores(ArrayList<Integer> numf) {

		ArrayList<Integer> filtroNum = new ArrayList<Integer>();
		int positivos = 0;
		int negativos = 0;
		int ceros = 0;

		for (int i = 0; i < numf.size(); i++) {

			if (numf.get(i) >= 1) {
				positivos++;

			}
			if (numf.get(i) <= -1) {
				negativos++;

			}
			if (numf.get(i) == 0) {
				ceros++;

			}
		}

		filtroNum.add(positivos);
		filtroNum.add(negativos);
		filtroNum.add(ceros);

		return filtroNum;

	}
}
