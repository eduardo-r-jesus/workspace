import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		double valorConta = Double.parseDouble(
				JOptionPane.showInputDialog(null, "Digite o valor da conta!", "Input", JOptionPane.QUESTION_MESSAGE));
		double valorGarcon = (valorConta * 10) / 100;
		JOptionPane.showMessageDialog(null,
				"10% do garçon: " + valorGarcon + "\n Valor Final: " + (valorConta + valorGarcon));

	}

}
