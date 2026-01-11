package AulasWhile;
import java.util.Scanner;

public class exercicio6_WHILE {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, contador = 0;
		
		System.out.print("Digite o número (0) para encerrar: ");
		numero = entrada.nextInt();
		while(numero != 0) {
			if (numero > 0) {
				contador++;
			}
			System.out.print("Digite outro número: ");
			numero = entrada.nextInt();
		}
		System.out.println("Quantidade de n números positivos digitados: " + contador);
		entrada.close();
		
		
		
	}

}
