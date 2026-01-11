package aula_IF1;
import java.util.Scanner;
public class exercicio8_IF {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("primeira nota aqui: ");
		double nota1 = entrada.nextDouble();
		entrada.nextLine();
		System.out.print("Segunda nota aqui: ");
		double nota2 = entrada.nextDouble();
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7.0){
			System.out.println("Aluno aprovado!!");
		}else if(media >= 5.9 && media <= 6.9){
			System.out.println("O aluno está de recuperação");
		}else if(media < 5.9) {
			System.out.println("Aluno de recuperação");
		}

	}

}
