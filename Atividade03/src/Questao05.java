import javax.swing.JOptionPane;

public class Questao05 {

	public static void main(String[] args) {
		double qtdHorasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Digite a quantidade de horas trabalhadas!", "Input", JOptionPane.QUESTION_MESSAGE));
		double valorHora = Double.parseDouble(
				JOptionPane.showInputDialog(null, "Digite o valor da hora!", "Input", JOptionPane.QUESTION_MESSAGE));
		double salario = qtdHorasTrabalhadas * valorHora;
		JOptionPane.showMessageDialog(null, "O salário do funcionário é: " + salario);

	}

}
