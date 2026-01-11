package switchAulas;
import java.util.Scanner;


/*
 Objetivo do exemplo
=====================================================================

Criar um sistema que pergunte ao usuário

Qual sua cor favorita apresentando uma das 3 opções abaixo:
  
1 - azul
2 - verde
3 - vermelho

a escolha sera processada com a estutura switch
=====================================================================
 */


public class switchAula1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha a sua cor favorita:");
		System.out.println("1 - Azul");
		System.out.println("2 - Verde");
		System.out.println("3 - Vermelho");
		System.out.print("Digite o número da opção: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Sua cor favorita é: Azul");
			break;
		case 2:
			System.out.println("Sua cor favorita é: Verde");
			break;
		case 3:
			System.out.println("Sua cor favorita é: Vermelho");
			break;
		default:
			System.out.println("Opção inválida");
		
		}
		
		
		
		
	}

}
