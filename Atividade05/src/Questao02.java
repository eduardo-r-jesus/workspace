import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		Object[] lsOpcoes = new Object[] { "Pedra", "Papel", "Tesoura" };
		Object[] confirmar = new Object[] {"Sim", "Não"};
		
		int jogarNovamente = 0;
		int vitoria = 0;
		int empate = 0;
		int derrota = 0;
		
		while (jogarNovamente == 0) {
			int escolherOpcao = JOptionPane.showOptionDialog(null, "Escolha uma opção!", "Escolha!", 0, JOptionPane.INFORMATION_MESSAGE, null, lsOpcoes, lsOpcoes[0]);
			int maquina = (int)(Math.random() * 3);
			String mensagem = "";
			
			if (escolherOpcao == maquina) {
				mensagem = "Empate";
				++empate;			
			}
			else if ((escolherOpcao != 0 || maquina != 2) && (escolherOpcao != 1 || maquina != 0) && (escolherOpcao != 2 || maquina != 1)){
				mensagem = "Derrota";
				++derrota;				
			}
			else {
				mensagem = "Vitória";
				++vitoria;
			}
			
			jogarNovamente = JOptionPane.showOptionDialog(null, "Eu (" +lsOpcoes[escolherOpcao]+") X Máquina ("+lsOpcoes[maquina]+")\nResultado: "+ mensagem+ "\nJogar Novamente?", "Jogo", 0, 3, null, confirmar, confirmar[0]);
		}
		
		JOptionPane.showMessageDialog(null, "Placar final\nVitórias: " +vitoria+ 
											"\nDerrotas: " +derrota+
											"\nEmpate: " + empate);		
		
	}

}
