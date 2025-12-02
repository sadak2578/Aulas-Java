package logica;

import logica.OperadoresAritimeticos;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
      System.out.println("----------------------------");
      mostrarOperadoresAritimeticos();
      mostrarOperadoresRelacionais();
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
}
