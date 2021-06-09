public class AlgoritmoCpf {

	public static void main(String[] args) {
		
		int[] cpf = new int[11];
		cpf[0] = 5;
		cpf[1] = 6;
		cpf[2] = 4;
		cpf[3] = 9;
		cpf[4] = 9;
		cpf[5] = 2;
		cpf[6] = 3;
		cpf[7] = 0;
		cpf[8] = 1;
		// cpf[9]=0;
		// cpf[10]=x;

		int p = 0;
		int soma = 0;

		for (int i = 10; i >= 2; i--) {
			int mult = i * cpf[p];
			soma += mult;
			//System.out.println("i:" + i + ", cpf:" + cpf[p] + ", p:" + p + ", X:" + mult);
			p++;
		}

		//System.out.println("Soma dos valores multiplicados: " + soma);

		int resto = (soma % 11);

		//System.out.println(resto);

		if (resto < 2) {
			cpf[9] = 0;
		} else {
			cpf[9] = 11 - resto;
		}

		//System.out.println("Primeiro dígito: " + cpf[9]);

		p = 0;
		soma = 0;

		for (int i = 11; i >= 2; i--) {
			int mult = i * cpf[p];
			soma += mult;
		//	System.out.println("i:" + i + ", cpf:" + cpf[p] + ", p:" + p + ", X:" + mult);
			p++;
		}

		//System.out.println("Soma dos valores multiplicados: " + soma);

		resto = (soma % 11);

		//System.out.println(resto);

		if (resto < 2) {
			cpf[10] = 0;
		} else {
			cpf[10] = 11 - resto;
		}

		//System.out.println("Segundo dígito: " + cpf[10]);

		for (int i = 0; i <= 10; i++) {
			System.out.print(cpf[i]);
		}
	}

}
