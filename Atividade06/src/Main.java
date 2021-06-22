import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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
					JOptionPane.showMessageDialog(null, "Favor, informe o seu nome!");
				}
			}
		}

		aux = false;
		while (!aux) {
			try {
				p.setDatNasc(
						LocalDate.parse(
								JOptionPane.showInputDialog(
										"Informe sua data de nascimento informando no formato DD/MM/AAAA: "),
								formatarData));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Favor, informe sua data de nascimento no formato DD/MM/AAAA!");
			}
		}

		aux = false;
		while (!aux) {
			try {
				p.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Informe sua altura: ").replace(",", ".")));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Informe somente números e/ou . ao inevez de , !");
				e.printStackTrace();
			}
		}
		JOptionPane.showMessageDialog(null, p.exibirDadosPessoa());
	}

}
