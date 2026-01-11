package aula_IF1;
import java.util.Locale;
import java.util.Scanner;

public class aula3_IF {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome do aluno aqui: ");
		String nomeAluno = entrada.nextLine();
		
		System.out.print("Primeira nota do aluno: ");
		double nota1 = entrada.nextDouble();
		
		System.out.print("Segunda nota do aluno: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		String medianaTexto = String.format("A mediana é %.1f ", media);
		
		if (media >=7.0 || media >=6.0) {
			System.out.println("O aluno " + nomeAluno + " tirou " + medianaTexto + " e está aprovado");
		}else if (media >=5.0) {
			System.out.println("O aluno " + nomeAluno+ " tirou " + medianaTexto + " e está de recuperação");
			
		}else if (media >=4.0 || media <=4.0) {
			System.out.println("O aluno " + nomeAluno + " tirou " + medianaTexto + " e foi reprovado");
		}
		
		
	}

}
