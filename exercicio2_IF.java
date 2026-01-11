package aula_IF1;
import java.util.Scanner;

public class exercicio2_IF {

	public static void main(String[] args) {
		/*
		 Lógica
		 o número vai ser considerado par se o resto da divisão dele por 2 for igual a zero
		 ou seja
		 se 4 % 2 == 0
		 * */
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número aqui: ");
		int num = entrada.nextInt();
		entrada.nextLine();
		//int calculo = (num % 2);
		
		if ((num % 2) == 0) {
			System.out.println("O número digitado é par");
		}else if ((num % 2) == 1) {
			System.out.println("O número digitado é impar");
		}
	}

}
