package switchAulas;
import java.util.Scanner;

/*
 Criar um programa que solicita ao usuário uma letra
 o programa deve identificar se a letra digita é uma vogal
 ou uma consoante
 
 
 vogal (a,e,i,o,u) ou uma consoante
 * 
 * 
 * */


public class exercicio3_SWITCH {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite aqui somente uma letra: ");
		char letra = entrada.next().toLowerCase().charAt(0);
		
		switch (letra) {
		
			case 'a':
				System.out.println("A letra digitada e uma vogal");
				break;
			case 'e':
				System.out.println("A letra digitada é uma vogal");
				break;
			case 'i':
				System.out.println("A letra digitada é uma vogal");
				break;
			case 'o':
				System.out.println("A letra digitada é uma vogal");
				break;
			case 'u':
				System.out.println("A letra digitada é uma vogal");
				break;
			default:
				System.out.println("A letra digitada é uma consoante");
		}

	}

}
