import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número!"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número!"));

		StringBuilder resultado = new StringBuilder();

		if (num1 < num2) {
			for (int i = num1; num2 >= i; i++) {
				int seq = i;
				resultado.append(seq).append(",");
			}
			JOptionPane.showMessageDialog(null, "Os números entre " + num1 + " e " + num2 + " são: " + resultado);

		} else if (num1 == num2) {
			JOptionPane.showMessageDialog(null, "Os valores digitados são iguais.");

		} else {
			for (int i = num1; num2 <= i; i--) {
				int seq = i;
				resultado.append(seq).append(",");

			}
			JOptionPane.showMessageDialog(null, "Os números entre " + num1 + " e " + num2 + " são: " + resultado);
		}

	}

}

//solução professor
//public static void main(String[] args) {
//	int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número!"));
//	int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número!"));
//
//	String numeros = "";
//		for (int i = num1; num2 >= i; i++) {
//			numeros += i + "," ;
//		}
//		JOptionPane.showMessageDialog(null, "Os números entre " + num1 + " e " + num2 + " são: " + numeros);
//
//} 


