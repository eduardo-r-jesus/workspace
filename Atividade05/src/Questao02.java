import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		Object[] lsOpcoes = { "Pedra", "Papel", "Tesoura" };
		
		
		int jogarNovamente = 0;
		int vitoria = 0;
		int empate = 0;
		int derrota = 0;
		
		Object[] continuar = {"Sim", "Não"};
		
		while (jogarNovamente == 0) {
			int escolherOpcao = JOptionPane.showOptionDialog(null, "Escolha uma opção!", "Escolha!", 0, JOptionPane.INFORMATION_MESSAGE, null, lsOpcoes, lsOpcoes[0]);
			int maquina = (int)(Math.random() * 3);
			String mensagem = "";
			
			if (escolherOpcao == maquina) {
				mensagem = "Empate";
				++empate;			
			}
			else if ((escolherOpcao == 0 && maquina == 2) || (escolherOpcao == 1 && maquina == 0) || (escolherOpcao == 2 && maquina == 1)){
				mensagem = "Vitoria";
				++vitoria;				
			}
			else {
				mensagem = "Derrota";
				++derrota;
			}
			
			jogarNovamente = JOptionPane.showOptionDialog(null, "Eu (" +lsOpcoes[escolherOpcao]+") X Máquina ("+lsOpcoes[maquina]+")\nResultado: "+ mensagem+ "\nJogar Novamente?", "Jogo", 0, JOptionPane.INFORMATION_MESSAGE, null, continuar, continuar[0]);
		}
		
		JOptionPane.showMessageDialog(null, "Placar final\nVitórias: " +vitoria+ 
											"\nDerrotas: " +derrota+
											"\nEmpate: " + empate);		
		
	}

}
