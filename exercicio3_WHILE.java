package AulasWhile;
import java.util.Scanner;

public class exercicio3_WHILE {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = -1;
		
		
		while (num != 0) {
			System.out.print("Digite um número aqui (digite 0 para sair): ");
			num = entrada.nextInt();
			
			
			
			
		}
		System.out.println("Programa encerrado");
		
		
		entrada.close();
	}

}
