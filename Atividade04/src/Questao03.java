import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero!"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero!"));

		StringBuilder resultado = new StringBuilder();

		if (num1 < num2) {
			for (int i = num1; num2 >= i; i++) {
				int seq = i;
				resultado.append(seq).append(",");
			}
			JOptionPane.showMessageDialog(null, "Os n�meros entre " + num1 + " e " + num2 + " s�o: " + resultado);

		} else if (num1 == num2) {
			JOptionPane.showMessageDialog(null, "Os valores digitados s�o iguais.");

		} else {
			for (int i = num1; num2 <= i; i--) {
				int seq = i;
				resultado.append(seq).append(",");

			}
			JOptionPane.showMessageDialog(null, "Os n�meros entre " + num1 + " e " + num2 + " s�o: " + resultado);
		}

	}

}

//solu��o professor
//public static void main(String[] args) {
//	int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero!"));
//	int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero!"));
//
//	String numeros = "";
//		for (int i = num1; num2 >= i; i++) {
//			numeros += i + "," ;
//		}
//		JOptionPane.showMessageDialog(null, "Os n�meros entre " + num1 + " e " + num2 + " s�o: " + numeros);
//
//} 


