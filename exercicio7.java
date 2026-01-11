package AulasWhile;
import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//int senha = 0;
		int senhaCorreta = 0;
	
		
		while (senhaCorreta != 1234) {
			System.out.print("Informe a senha correta aqui [somente Numeros]: ");
			senhaCorreta = entrada.nextInt();
			if (senhaCorreta == 1234) {
				System.out.println("Parabéns vc passou!");
				
			}else {
				System.out.println("Senha errada!");
			}
		}
		entrada.close();
	}

}
