import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class GerarContraCheque {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat();
		df.applyPattern("R$ 0.00");

		float valorHora = 10f;
		String matricula = JOptionPane.showInputDialog("Informe sua matrícula: ");
		String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
		int hora = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de horas trabalhadas: "));

		while (hora < 0) {
			JOptionPane.showMessageDialog(null, "As horas trabalhadas não pode ser menor que 0.");
			hora = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de horas trabalhadas: "));
		}

		float minutos = Float.parseFloat(JOptionPane.showInputDialog("Informe o restante dos minutos trabalhados: "));

		while (minutos < 0 || minutos > 59) {

			if (minutos < 0) {
				JOptionPane.showMessageDialog(null, "Os minutos trabalhados não pode ser menor que 0.");
				minutos = Float.parseFloat(JOptionPane.showInputDialog("Informe o restante dos minutos trabalhados: "));
			} else if (minutos > 59) {
				JOptionPane.showMessageDialog(null, "Os minutos não pode ser maior que 59.");
				minutos = Float.parseFloat(JOptionPane.showInputDialog("Informe o restante dos minutos trabalhados: "));
			}
		}

		float salario = (hora * valorHora) + ((minutos / 60) * valorHora);
		int qtdDiasUteis = 19;
		int qtsDomingosFeriados = 6;
		float dsr = (((hora + (minutos / 60)) / qtdDiasUteis) * qtsDomingosFeriados) * valorHora;
		float salarioBruto = salario + dsr;
		float valorInss = 0;

		if (salarioBruto <= 1100) {
			valorInss = (salarioBruto * 0.075f);
		} else if (salarioBruto >= 1100.01 && salarioBruto <= 2203.48) {
			valorInss = ((salarioBruto - 1100) * 0.09f) + 82.5f;
		} else if (salarioBruto >= 2203.49 && salarioBruto <= 3305.22) {
			valorInss = ((salarioBruto - 2203.48f) * 0.12f) + 181.81f;
		} else if (salarioBruto >= 3305.23 && salarioBruto <= 6433.57) {
			valorInss = ((salarioBruto - 3305.22f) * 0.14f) + 314.01f;
		} else {
			valorInss = 751.99f - 38.89f;
		}

		float valorIR = 0;

		if (salarioBruto >= 1903.99 && salarioBruto <= 2826.65) {
			valorIR = (salarioBruto * 0.075f) - 142.8f;
		} else if (salarioBruto >= 2826.66f && salarioBruto <= 3751.05f) {
			valorIR = (salarioBruto * 0.15f) - 354.8f;
		} else if (salarioBruto >= 3751.06 && salarioBruto <= 4664.68) {
			valorIR = (salarioBruto * 0.225f) - 636.13f;
		} else if (salarioBruto > 4664.68) {
			valorIR = (salarioBruto * 0.275f) - 869.36f;
		}

		float salarioLiquido = salarioBruto - valorInss - valorIR;

		JOptionPane.showMessageDialog(null,
				"** Contra Cheque **" + "\nMatrícula/Nome: " + matricula + "/" + nome + "\nSalário Base: "
						+ df.format(salarioLiquido) + "\nValor do DSR: " + df.format(dsr) + "\nValor do INSS: "
						+ df.format(valorInss) + "\nValor do IR: " + df.format(valorIR) + "\nTotal Bruto: "
						+ df.format(salarioBruto) + "\nTotal Líquido: " + df.format(salarioLiquido));

	}

}
