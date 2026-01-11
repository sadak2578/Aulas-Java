package AulasWhile;
import java.util.Scanner;
public class exercicio9_WHILE {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número aqui: ");
		int num1 = entrada.nextInt();
		System.out.print("Digite outro número aqui: ");
		int num2 =  entrada.nextInt();
		if (num1 == num2) {
			System.out.println("Ambos os números são iguais, não existem numeros exclusivos entre eles");
		}else {
			System.out.println("Números entre " + num1 + " e " + num2 + ":");
			int menor = Math.min(num1, num2); // pega o menor número entre o primeiro numero digitado e o segundo numero digitado
			int maior = Math.max(num1, num2); // faz o contrário, pega o maior número entre os dois números digitados.
			int atual = menor + 1;
			while (atual < maior) {
				System.out.println(atual);
				atual++;
			}
		}
		entrada.close();
	}

}
