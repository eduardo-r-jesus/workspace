import javax.swing.JOptionPane;

public class Exemplo02 {

	public static void main(String[] args) {

		String sexo = JOptionPane.showInputDialog(null, "Digite M ou F para o sexo!");
		String mensagem = "";
		if (sexo.length() != 1) {
			mensagem = "Informe somente 1 caracter.";
		} else if (sexo.toUpperCase().equals("M")) {
			mensagem = "Masculino";
		} else if (sexo.toUpperCase().equals("F")) {
			mensagem = "Feminino";
		} else {
			mensagem = "Nenhuma informa��o encontrada!";
		}
		JOptionPane.showMessageDialog(null, mensagem);

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		if (idade >= 18) {
			JOptionPane.showMessageDialog(null, "Voc� possui idade para tirar sua CNH!");
		} else {
			JOptionPane.showMessageDialog(null, "Desculpe! Voc� n�o possui idade para tirar sua CNH!");
		}
	}
}
