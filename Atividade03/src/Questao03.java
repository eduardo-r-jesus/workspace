import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		double nota1 = Double.parseDouble(
				JOptionPane.showInputDialog(null, "Digite a nota 1!", "Input", JOptionPane.QUESTION_MESSAGE));
		double nota2 = Double.parseDouble(
				JOptionPane.showInputDialog(null, "Digite a nota 2!", "Input", JOptionPane.QUESTION_MESSAGE));
		double media = (nota1 + nota2) / 2;
		JOptionPane.showMessageDialog(null, "A média é: " + media);
	}

}
