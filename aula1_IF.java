package aula_IF1;
import java.util.Scanner;

public class aula1_IF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Sua idade aqui: ");
		int idade = sc.nextInt();
		if (idade > 18) {
			System.out.println(nome + " Você está muito velho pro alistamento, paga a multa!!");
		} else if (idade == 18) {
			System.out.println(nome + " haha vai ter q se inscrever, OTÁRIO!! vc tem 18 aninhos muahaha");
		} else if (idade < 18) {
			System.out.println("hmmm vc n tem 18 anos ainda... >:D mas em beve vai fazeeeer nhehhe");
		} else {
			System.out.println("parabéns... ANIMAL! n sei como vc quebrou o código pra chegar aqui mas vc me achou");
			System.out.println("este é um esteregg e vc me achou... me fala como fez isso?");
		}
		

	}

}
