import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
		int num = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Digite 1 n�mero!", "Input", JOptionPane.QUESTION_MESSAGE));
		int numAnterior = num - 1;
		int numPosterior = num + 1;
		JOptionPane.showMessageDialog(null, "Os n�meros vizinhos s�o: " + numAnterior + " e " + numPosterior);
	}

}
