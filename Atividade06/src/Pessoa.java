import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Pessoa {

	private String nome;
	private int diaNasc;
	private int mesNasc;
	private int anoNasc;
	private float alt;
	LocalDate hoje = LocalDate.now();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDiaNasc() {
		return diaNasc;
	}

	public void setDiaNascimento(int diaNasc) {
		this.diaNasc = diaNasc;
	}

	public int getMesNasc() {
		return mesNasc;
	}

	public void setMesNascimento(int mesNasc) {
		this.mesNasc = mesNasc;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNascimento(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public float getAltura() {
		return alt;
	}

	public void setAltura(float altura) {
		this.alt = altura;
	}

	public void exibirDadosPessoa() {
		JOptionPane.showMessageDialog(null,
				"Seu nome é: " + getNome() + "\nSua data de nascimento é: " + getDiaNasc() + "/" + getMesNasc() + "/"
						+ getAnoNasc() + "\nSua Idade é: " + calculaIdade() + "\nSua altura é: " + getAltura());
	}

	public int calculaIdade() {
		
		int diah = hoje.getDayOfMonth();
		int mesh = hoje.getMonthValue() + 1;
		int anoh = hoje.getYear();

		int idade;

		if (mesNasc < mesh || (mesNasc == mesh && diaNasc <= diah))
			idade = anoh - anoNasc;
		else
			idade = (anoh - anoNasc) - 1;

		return (idade);

	}

}
