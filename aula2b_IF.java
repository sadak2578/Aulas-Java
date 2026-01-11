package aula_IF1;
import java.util.Scanner;

public class aula2b_IF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva o nome do aluno aqui: ");
		String aluno = sc.nextLine();
		
		System.out.print("Qual a nota do aluno?: ");
		double nota = sc.nextDouble();
		
		if (nota >= 7 || nota >= 6.0) {
			System.out.println("O aluno " + aluno + " foi aprovado");
		} else if (nota >= 5) {
			System.out.println("O aluno " + aluno + " está de recuperação");
			
		} else if (nota >= 4 ) {
			System.out.println("O aluno " + aluno + " foi reprovado!");
		}
		

	}

}
