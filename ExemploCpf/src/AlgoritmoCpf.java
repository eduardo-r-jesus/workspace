import javax.swing.JOptionPane;

public class AlgoritmoCpf {

	static int gerarNumeroEntre(int menorValor, int maiorValor) {
		int distancia = maiorValor - menorValor;
		return (int) (Math.random() * distancia) + menorValor;
	}

	static String formatarCPF(String numCpf) {
		String[] arCpf = numCpf.split("");
		int ctr = 0;
		String cpf = "";
		for (int i = 0; i <= 10; i++) {
			cpf += arCpf[i].toString();
			ctr++;
			if (ctr == 3 || ctr == 6) {
				cpf += ".";
			} else if ((ctr == 9)) {
				cpf += "-";
			}
		}
		return cpf;
	}

	public static void main(String[] args) {
		int[] cpf = new int[11];
		cpf[0] = 9;
		cpf[1] = 4;
		cpf[2] = 0;
		cpf[3] = 4;
		cpf[4] = 9;
		cpf[5] = 7;
		cpf[6] = 9;
		cpf[7] = 2;
		cpf[8] = 0;
//		cpf[9] = x;
//		cpf[10] = x;
// 		cpf = 111444777XX
		String numCpf = " ";
		Object[] lsOpcoes = { "Gerar CPF", "Validar CPF" };
		int opcao = JOptionPane.showOptionDialog(null, "Escolha!", "Escolha!", 0, JOptionPane.WARNING_MESSAGE, null,
				lsOpcoes, lsOpcoes[0]);

		if (opcao == 1) {
			do {
				numCpf = JOptionPane.showInputDialog("Digite o número do CPF: ");
			} while (numCpf.length() != 11);

			String[] str = numCpf.split("");
			for (int i = 0; i <= 8; i++) {
				cpf[i] = Integer.parseInt(str[i]);
			}
		} else {
			for (int i = 0; i <= 8; i++) {
				cpf[i] = gerarNumeroEntre(0, 9);
			}
		}

		int p = 0;
		int soma = 0;

		for (int i = 10; i >= 2; i--) {
			int mult = i * cpf[p];
			soma += mult;
			p++;
		}

		int resto = (soma % 11);

		if (resto < 2) {
			cpf[9] = 0;
		} else {
			cpf[9] = 11 - resto;
		}

		p = 0;
		soma = 0;

		for (int i = 11; i >= 2; i--) {
			int mult = i * cpf[p];
			soma += mult;
			p++;
		}

		resto = (soma % 11);

		if (resto < 2) {
			cpf[10] = 0;
		} else {
			cpf[10] = 11 - resto;
		}

		String cpfValido = "";
		for (int i = 0; i <= 10; i++) {
			cpfValido += cpf[i];
		}

		//cpfValido = formatarCPF(cpfValido);

		//erro ao informar 1 cpf válido
		String msg = "";
		if (cpfValido.equals(numCpf) || opcao == 0) {
			cpfValido = formatarCPF(cpfValido);
			msg = "Esté é um CPF válido: " + cpfValido;
		} else {
			numCpf = formatarCPF(numCpf);
			cpfValido = formatarCPF(cpfValido);
			msg = "O CPF informado é inválido: " + numCpf + " é diferente " + cpfValido;
		}
		JOptionPane.showMessageDialog(null, msg);
	}

}
