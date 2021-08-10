import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class NumerosAleatoriosMegaSena {

	private static List<Integer> numeros;

	public static void main(String[] args) {

		numeros = new ArrayList<>();
		int qtd = 14;

		while (numeros.size() < qtd) {
			int numero = new Random().nextInt(80) + 1;
			if (!numeros.contains(numero)) {
				numeros.add(numero);
			}
		}
		Collections.sort(numeros);
		JOptionPane.showMessageDialog(null, "OS "+ qtd+ " números selecionados foram: \n" + numeros);
	}

}
