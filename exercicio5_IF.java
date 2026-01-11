package aula_IF1;
import java.util.Scanner;

public class exercicio5_IF {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira um número inteiro aqui: ");
		int num = entrada.nextInt();
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("O número " + num + " é multiplo de 3 e 5");
		}else {
			System.out.println("O número " + num + " não é multiplo de 3 e 5");
		}
		entrada.close();
	}	

}
