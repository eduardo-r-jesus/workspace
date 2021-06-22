import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {

	private String nome;
	private float alt;
	private LocalDate datNasc;

	LocalDate hoje = LocalDate.now();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getAltura() {
		return alt;
	}

	public void setAltura(float altura) {
		this.alt = altura;
	}

	public LocalDate getDatNasc() {
		return datNasc;
	}

	public void setDatNasc(LocalDate datNasc) {
		this.datNasc = datNasc;
	}

	public String exibirDadosPessoa() {
		DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Seu nome é: " + getNome() + "\nSua Data de Nascimento: " + getDatNasc().format(formatarData)
				+ "\nSua Idade é: " + calculaIdade() + "\nSua altura é: " + getAltura();
	}

	public int calculaIdade() {
		int idade = (hoje.getYear() - getDatNasc().getYear());
		if (getDatNasc().getMonthValue() > hoje.getMonthValue() || (getDatNasc().getMonthValue() == hoje.getMonthValue()
				&& getDatNasc().getDayOfMonth() > hoje.getDayOfMonth())) {
			idade--;
		}
		return idade;
	}

}
