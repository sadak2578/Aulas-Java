package aula_IF1;
import java.util.Scanner;

public class aula5_IF {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua idade aqui: ");
		int idade = entrada.nextInt();
		entrada.nextLine();
		
		System.out.print("Você é estudante? (sim/não): ");
		
		String estudante = entrada.nextLine().toLowerCase();
		
		if  (idade <= 18 && estudante.equals("sim")) {
			System.out.println("Você tem direito a meia entrada no cinema ;)");
			
			
		}else if (idade <= 18 && estudante.equals("não")) {
			System.out.println("infelizmente a meia entrada é concedidade apenas a estudantes");
			System.out.println("mesmo que seja menor de idade");
			
		}else if (idade >= 18 && estudante.equals("sim")) {
			System.out.println("Você tem direito a meia entrada no cinema ;)");
		}
		entrada.close();
		
		
	}

}
