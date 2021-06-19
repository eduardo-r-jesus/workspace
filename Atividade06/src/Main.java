import javax.swing.JOptionPane;

public class Main extends Pessoa {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();

		boolean aux = false;

		while (!aux) {
			try {
				p.setNome(JOptionPane.showInputDialog("Informe o seu nome: "));
				if (p.getNome() == null || p.getNome().equals("")) {
					JOptionPane.showMessageDialog(null, "Favor, informe o seu nome!");
				} else {
					aux = true;
				}

			} catch (Exception e) {
				{

				}
			}
		}

		aux = false;
		while (!aux) {
			try {
				p.setDiaNascimento(Integer.parseInt(JOptionPane.showInputDialog("Informe o DIA do seu nascimento: ")));
				if (p.getDiaNasc() < 1 || p.getDiaNasc() > 31) {
					JOptionPane.showMessageDialog(null, "O DIA informado n�o � v�lido!");
				} else {
					aux = true;
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Favor, informe o DIA do seu nascimento somente com n�meros!");
			}
		}

		aux = false;
		while (!aux) {
			try {
				p.setMesNascimento(Integer.parseInt(JOptionPane.showInputDialog("Informe o M�S do seu nascimento: ")));
				if (p.getMesNasc() < 1 || p.getMesNasc() > 12) {
					JOptionPane.showMessageDialog(null, "O M�S informado n�o � v�lido!");
				} else {
					aux = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Favor, informe o M�S do seu nascimento!");
			}
		}

		aux = false;
		while (!aux) {
			try {
				p.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Informe o ANO do seu nascimento: ")));
				if (p.getAnoNasc() < 1900 || p.getAnoNasc() > p.hoje.getYear()) {
					JOptionPane.showMessageDialog(null, "O ANO informado n�o � v�lido!");
				} else {
					aux = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Favor, informe o ANO do seu nascimento!");
			}
		}

		aux = false;
		while (!aux)
		{
			try {
				p.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Informe sua altura: ")));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Informe somente n�meros e/ou . ao inevez de , !");
			}

		}

		p.exibirDadosPessoa();

	}

}
