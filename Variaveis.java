package Logica;

/*
 Logo abaixo, demonstro como usar diferentes jeitos de printar as variáveis padrões na tela
 * 
 * 
 * */


public class Variaveis {

	public static void main(String[] args) {
		int Idade = 25; // inteiro
		double Altura = 1.76; // decimal
		String Nome = "João"; // String
		boolean Estudando = true; // verdade ou falso
		//System.out.println("Nome: " + Nome + " tem " + Idade + " anos de idade");
		//System.out.println(Nome + " tem " + Altura + " metros de altura");
		//System.out.println(Nome + " esta estudando?: " + Estudando);
		//System.out.printf("%s tem %d anos de idade e %s tem %.2f metros de  altura", Nome, Idade, Nome , Altura);
		//System.out.printf("\n%s está estudando?: %b", Nome, Estudando);
		System.out.println("Nome: " + Nome);
		System.out.println("Idade: " + Idade);
		System.out.println("Altura: " + Altura);
		System.out.println("Está estudando?: " + Estudando);

	}

}
