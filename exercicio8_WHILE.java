package AulasWhile;
import java.util.Scanner;
public class exercicio8_WHILE {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número para o fatorial: ");
		int numero = entrada.nextInt();
		int fatorial = 1;
		int i = 1;
		
		while (i <= numero) {
			fatorial *= i;
			i++;
		}
		System.out.println("O fatorial de " + numero + " é " + fatorial);
		entrada.close();
		
	}

}
