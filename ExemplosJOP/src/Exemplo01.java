import javax.swing.JOptionPane;

public class Exemplo01 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Olá Mundo JOP", "Alerta!!", JOptionPane.WARNING_MESSAGE);

		JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Alerta", JOptionPane.YES_NO_OPTION);

		Object[] options = { "OK", "Cancelar" };
		JOptionPane.showOptionDialog(null, "Clique OK para continuar!", "Alerta", JOptionPane.DEFAULT_OPTION,
				JOptionPane.WARNING_MESSAGE, null, options, options[0]);

		String nome = JOptionPane.showInputDialog("Digite se nome!");
		if (!nome.equals("")) {
			System.out.println("O nome digitado foi: " + nome);
		} else {
			System.out.println("Por favor, informe o seu nome!");
		}

		Object[] itens = { "Maça", "Banana", "Uva" };
		Object itemSelecionado = JOptionPane.showInputDialog(null, "Escolha um item!", "Itens",
				JOptionPane.INFORMATION_MESSAGE, null, itens, itens[1]);
		System.out.println("Item selecionado: " + itemSelecionado.toString());

	}

}
