package aula_IF1;
import java.util.Scanner;
public class exercicio6_IF {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número aqui: ");
		int num = entrada.nextInt();
		entrada.nextLine();
		
		if (num > 0){
			System.out.println("O número " + num + " é positivo");
		}else if (num == 0){
			System.out.println("O número " + num + " é igual a zero");
		}else {
			System.out.println("O número " + num + " é negativo");
		}

	}

}
