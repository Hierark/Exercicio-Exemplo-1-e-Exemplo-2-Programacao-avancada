        import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		int funcionario; 
		int horas_trabalhadas; 
		double valor_hora;
		double salario;

		Scanner numero = new Scanner(System.in);

		System.out.println("Informe o número do funcíonario: ");
		funcionario = numero.nextInt();  

		System.out.println("Informe o número de horas trabalhadas: "); 
		horas_trabalhadas = numero.nextInt(); 

		System.out.println("Informe o valor que recebe por hora"); 
		valor_hora = numero.nextDouble(); 

		double salario_funcionario = horas_trabalhadas * valor_hora;

		System.out.println("O número do funcionario é: " + funcionario);
		System.out.printf("O valor do Salário é de: R$ %.2f", salario_funcionario);
	}

}

