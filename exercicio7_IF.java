package aula_IF1;
import java.util.Scanner;
public class exercicio7_IF {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um ano aqui: ");
		int ano = entrada.nextInt();
		entrada.nextLine();
		
		if(ano % 4 == 0 && ano % 100 != 0) {
			
			System.out.println("Possivelmente o ano " + ano + " é bissexto");
		}else if (ano % 4 == 0 && ano % 100 == 0) {
			System.out.println("O ano " + ano + " não é bissexto");
		}else if(ano % 100 == 0 && ano % 400 == 0) {
			System.out.println("O ano " + ano + " é bissexto");
			
		}else {
			System.out.println("o ano não é bissexto");
		}

	}

}
