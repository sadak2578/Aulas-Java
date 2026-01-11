package aula_IF1;
import java.util.Scanner;
public class exercicio3_IF {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro número aqui: ");
		int primeiroNumero = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Digite o segundo número aqui: ");
		int segundoNumero = entrada.nextInt();
		
		if (primeiroNumero > segundoNumero) {
			System.out.println("O número " + primeiroNumero + " é maior que " + segundoNumero);
		}else if (primeiroNumero == segundoNumero) {
			System.out.println("O númmero " + primeiroNumero + " é igual a " + segundoNumero);
		}else if (segundoNumero > primeiroNumero) {
			System.out.println("O número " + segundoNumero + " é maior que " + primeiroNumero);
		}
	}

}
