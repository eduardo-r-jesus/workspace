
public class Exemplo01 {

	public static void main(String[] args) {
		int[] n = { 5, 6, 9, 1, 3, 2 };
		int aux = 0;

		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + ",");
		}

		for (int i = 0; i < n.length; i++) {
			// System.out.println(n[i]);
			for (int j = i + 1; j < n.length; j++) {
				// System.out.println("Comparação entre " +n[i]+ " == " + n[j]);
				if (n[i] > n[j]) {
					aux = n[i];
					n[i] = n[j];
					n[j] = aux;
				}
			}
		}
		System.out.println("");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + ",");
		}

	}

}
