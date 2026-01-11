package aula_IF1;
import java.util.Scanner;
public class exercicio4_IF {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número que esteja no intervalo [10,100]: ");
		int num = entrada.nextInt();
		
		if(num >= 10 && num <=100) {
			System.out.println("O número " + num + " está dentro do intervalo de [10,100]");
		}else {
			System.out.println("O número " + num + " não está dentro do intervalo de [10, 100]");
			
		}

	}

}
