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
			mensagem = "Nenhuma informação encontrada!";
		}
		JOptionPane.showMessageDialog(null, mensagem);

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		if (idade >= 18) {
			JOptionPane.showMessageDialog(null, "Você possui idade para tirar sua CNH!");
		} else {
			JOptionPane.showMessageDialog(null, "Desculpe! Você não possui idade para tirar sua CNH!");
		}
	}
}
