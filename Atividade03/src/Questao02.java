import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		int num1 = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Digite 1 número!", "Input", JOptionPane.QUESTION_MESSAGE));
		int num2 = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite outro número!", "Input", JOptionPane.QUESTION_MESSAGE));
		int soma = num1 + num2;
		JOptionPane.showMessageDialog(null, "A soma entre os números é: " + soma);
	}

}
