package AulasWhile;

/*
 O que é o while? ele é o enquanto

no primeiro exemplos podemos ver que enquanto o contador estiver menor que 5 ele vai continuar contando
assim que ele for igual a 5 ele para de contar e o código acaba
para que ele conte foi adicionado o  ++ na frente do contador, na linha 20.
*/

public class aula1_While {

	public static void main(String[] args) {
		System.out.println("\n1. Contar de um a 5\n");
		int contador = 1;
		while (contador <= 5) {
			System.out.println("Contador: " + contador);
			contador++; //Nessa parte eu estou adicionando mais números ao contador, ou seja 1+1 = 2, 2+1 = 3, até dar o contador = 5.
 			
		}
		
		System.out.println("\n2. Contagem regressiva de 5 a 1\n");
		int numero = 5;
		while(numero >= 1) {
			System.out.println("Número: " + numero + "");
			numero--;
			
		}
		System.out.println("\nSoma os números de 1 a 10\n");
		int soma = 0;
		int i = 1;
		while(i <= 10) {
			soma += i;
			i++;
			System.out.println("Soma: " + soma + "  i:  " + i);
			
		}
		System.out.println("A soma de 1 até 10 é: " + soma);
		
	}

}
