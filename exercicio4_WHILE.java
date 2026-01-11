package AulasWhile;
import java.util.Scanner;

public class exercicio4_WHILE {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		while(num >= 0) {
			System.out.print("Digite um número aqui: ");
			num = entrada.nextInt();
			
		
		}
		System.out.println("Fluxo encerrado");
		entrada.close();
		
		

	}

}
