package switchAulas;
import java.util.Scanner;

public class exercicio2_SWITCH {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		
		int num1 = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Digite o segundo número: ");
		int num2 = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Digite a operação (+ - * /): ");
		char operador = entrada.next().charAt(0);
		switch (operador) {
		
			case '+': 
				System.out.println("O resultado da operação foi de: " + (num1 + num2));
				break;
			
			case '-':
				System.out.println("Resultado: " + (num1 - num2));
				break;
			case '*':
				System.out.println("Resultado: " + (num1 * num2));
				break;
			case '/':
				System.out.println("Resultado: " + (num1 / num2));
				break;
			
		
		}
		
		
		
		
	}

}
