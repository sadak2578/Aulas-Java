import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Primeira nota do aluno: \n");
      double nota1 = sc.nextDouble();
      
      System.out.print("Segunda nota do aluno: \n");
      double nota2 = sc.nextDouble();
      
      double media = (nota1 + nota2) / 2;
      String mediaFormatada = String.format("%.1f", media);
      System.out.println("A média do aluno é: " + mediaFormatada);
      
      if (media >= 7.0 || media >= 6.0) {
        System.out.println("Parabéns o aluno está aprovadíssimo");
      } else if (media >= 5.0) {
        System.out.println("O aluno está de recuperação");
      } else if (media < 5.0 || media >= 4.0 ) {
        System.out.println("Aluno reprovado");
      }
  }
}
