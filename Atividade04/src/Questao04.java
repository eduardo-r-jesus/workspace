import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {

		int tentativas = 1;
		String senha = JOptionPane.showInputDialog("Digite a palavra de acesso!");

		if (senha.equals("Java-2021")) {
			JOptionPane.showMessageDialog(null, "Permissão Aprovada.");
		} else {
			for (int i = 0; i < 4; i++) {
				JOptionPane.showMessageDialog(null, "Tente novamente: Tentativa " + tentativas);
				senha = JOptionPane.showInputDialog("Digite a palavra de acesso!");
				tentativas++;
				if (senha.equals("Java-2021")) {
					JOptionPane.showMessageDialog(null, "Permissão Aprovada.");
					break;
				} else if (tentativas > 4) {
					JOptionPane.showMessageDialog(null, "Senha bloqueada!!!");
				}
			}

		}

	}

}
