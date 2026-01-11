package AulasWhile;
import java.util.Scanner;

public class exercicio5_while {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		int quantidade = 0;
		int numero = 0;
		while(numero != -1) {
			System.out.print("Digite o número (-1) para sair: ");
			numero = entrada.nextInt();
			if (numero != -1) {
				soma += numero;
				quantidade++;
			}
		}
		if (quantidade > 0) {
			double media = (double) soma / quantidade; //pq colocou um double dentro e de um ()?
			//pq sgnifica que tudo depois dele vai ser convertido para double e armazenado em media
			// é chamado de cash
			System.out.println("Média dos números: " + media);
			
		}else {
			System.out.println("Nenhum número válido foi encontrado");
			entrada.close();
		}
		
		
		
	}

}
