import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
		String nomAluno = JOptionPane.showInputDialog("Digite o nome do aluno!");
		float notaFinal = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota final!"));

		if (notaFinal >= 0 && notaFinal <= 4) {
			JOptionPane.showMessageDialog(null, "O aluno " + nomAluno + " est� Reprovado com a nota " +notaFinal+ ".");
		} 
		else if (notaFinal >=4 && notaFinal < 7)	{
			JOptionPane.showMessageDialog(null, "O aluno " + nomAluno + " est� em Recupera��o com a nota " +notaFinal+ ".");
		}
		else if (notaFinal >=7 && notaFinal <=10){
			JOptionPane.showMessageDialog(null, "O aluno " + nomAluno + " est� Aprovado com a nota " +notaFinal+ ".");
		}
		else if(notaFinal > 10) {
			JOptionPane.showMessageDialog(null, "A nota informada (" + notaFinal + ") n�o pode ser maior que 10.0.");
		} 
		else {
			JOptionPane.showMessageDialog(null, "A nota informada (" + notaFinal + ") n�o pode ser menor que 0.");
		}

	}

}
