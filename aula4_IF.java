package aula_IF1;
import java.util.Scanner;


public class aula4_IF {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.print("Tem nacionalidade brasileira? (s/n): ");
		String nacionalidade = entrada.nextLine().toLowerCase();
		
		if  (idade >= 16 && nacionalidade.equals("s") || idade >= 16 && nacionalidade.equals("S")) {
			System.out.println("você pode votar!");
		}else if (idade >= 16 && nacionalidade.equals("n") || idade >= 16 && nacionalidade.equals("N")){
			System.out.println("Você não tem nacionalidade brasileira, você não pode votar");	
		}else if (idade < 16 && nacionalidade.equals("s") || idade < 16 && nacionalidade.equals("S") ) {
			System.out.println("Você não pode votar, você é menor de idade");
			
		}else if (idade< 16 && nacionalidade.equals("n") || idade < 16 && nacionalidade.equals("N")) {
			System.out.println("VOCÊ TA ACHANDO QUE É QUEM?! ACHA QUE É FÁCIL FABRICAR O MEL?!");
			System.out.println("TA ACHANDO FÁCIL FABRICAR PAPEL?!");
			System.out.println("SE QUER TEM NACIONALIDADE E AINDA É MENOR DE IDADE");
			System.out.println("VOLTA PROS STATES, GRINGO! >:(");
		}
		
		
		
		entrada.close();
		

	}

}
