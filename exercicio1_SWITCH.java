package switchAulas;
import java.util.Scanner;
public class exercicio1_SWITCH {

	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);
		System.out.print("Escolha um dos números abaixo");
		System.out.println("1 - Segunda");
		System.out.println("2 - Terça");
		System.out.println("3 - Quarta");
		System.out.println("4 - Quinta");
		System.out.println("5 - Sexta");
		System.out.println("6 - Sábado");
		System.out.println("7 - Domingo");
		System.out.print("Escolha um dos dias: ");
		
		int dia = entrada.nextInt();
		switch (dia){
		case 1:
			System.out.println("Parabéns você escolheu a Segunda-Feira");
			break;
		case 2:
			System.out.println("Parabéns você escolheu a Terça-Feira");
			break;
		case 3:
			System.out.println("Parabéns você escolheu a Quarta-Feira");
			break;
		case 4:
			System.out.println("Parabéns você escolheu a Quinta-Feira");
			break;
		case 5:
			System.out.println("Parabéns você escolheu a Sexta-Feira");
			break;
		case 6:
			System.out.println("Parabéns você escolheu a Sábado");
			break;
		case 7:
			System.out.println("Parabéns você escolheu a Domingo");
			break;
		default:
			System.out.println("Opção inválida");
		}
		
		
	}

}
