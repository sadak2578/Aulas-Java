package aula_IF1;

public class aula2_IF {

	public static void main(String[] args) {
		double nota =  6.0;
		if (nota >= 7 || nota >= 6.0) {
			System.out.println("O aluno está aprovado");
			
			
			
		}else if (nota >= 5) {
			System.out.println("aluno de recuperação");
		} else if (nota < 5) {
			System.out.println("Aluno reprovado");
		}
	}

}
