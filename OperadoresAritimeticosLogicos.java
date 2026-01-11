package Logica;

public class OperadoresAritimeticosLogicos {

	public static void main(String[] args) {
	      System.out.println("----------------------------");
	      mostrarOperadoresAritimeticos();
	      mostrarOperadoresRelacionais();
	      mostraOperadoresLogicos();
	      
	  }
	  public static void mostrarOperadoresAritimeticos(){
	    int a = 10;
	    int b = 3;
	    System.out.println("Operadores Aritiméticos:");
	    System.out.println(a + " + " + b + " = " + (a+b));
	    System.out.println(a + " x " + b + " = " + (a*b));
	    System.out.println(a + " ÷ " + b + " = " + (a/b));
	    System.out.println(a + " - " + b + " = " + (a-b));
	    System.out.println(a + " Resto de " + b + " = " + (a%b));
	  }
	  public static void mostrarOperadoresRelacionais(){
	    int x = 10;
	    int y = 20;
	    System.out.println("----------------------------");
	    System.out.println("x é igual a y?: " + (x == y));
	    System.out.println("x é diferente de y?: " + (x != y));
	    System.out.println("x é maior que y?: " + (x > y));
	    System.out.println("x é menor que y?: " + (x < y));
	    System.out.println("----------------------------");
	  }
	  public static void mostraOperadoresLogicos(){
		  int idade = 18;
		  //String nome = "Paulo";
		  boolean temCarteira = true;
		  // Se a idade for maior ou igual a 18 anos e tem carteira
		  boolean podeDirigir = (idade >= 18) && temCarteira;
		  // Se for maior ou igual a 18 anos OU tem carteira
		  boolean podeViajarSozinho = (idade >= 18) || temCarteira ;
		  // avalia se a pessoa não tem carteira  (negação de tem Carteira) -> no caso a variável passa a ser false
		  boolean naoTemCarteira = !temCarteira;
		  
		  System.out.println("A pessoa pode dirigir?: " + podeDirigir);
		  System.out.println("A pessoa pode viajar sozinha?: " + podeViajarSozinho);
		  System.out.println("A pessoa pode viajar sozinha?: " + podeViajarSozinho);
		  System.out.println("Não tem carteira?: " + naoTemCarteira);
		   
		  
		  
		  
	  }
	}