package aula_IF1;
import java.util.Scanner;
public class exercicio9_IF {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite uma letra aqui: ");
		char vogal = entrada.next().toLowerCase().charAt(0);
		
		if (vogal == 'a' || vogal == 'e' || vogal == 'i' || vogal == 'o' || vogal == 'u') {
			System.out.println("a letra " + vogal + " é uma vogal");
		 
	
	}else {
		System.out.println("A letra " + vogal + " não é uma vogal +_+");
	}
		}
	 

}
