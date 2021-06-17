import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		
		String nome = scan.nextLine();
		System.out.println("Bem vindo: "+nome);
		
		scan.close();
	}

}
