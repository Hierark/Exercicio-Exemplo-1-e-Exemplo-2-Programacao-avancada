import java.util.Scanner;

public class exercicio26 {

	public static void main(String[] args) {

		float a; 
		int i; 

		float soma = 1; 

		Scanner sc = new Scanner(System.in); 

		System.out.println("Informe um número para a altura: ");
		a = sc.nextFloat(); 

		System.out.println("Informe um número para a idade: ");
		i = sc.nextInt(); 

		if(a >= 1.5 && i >= 12) {

			soma = soma + 1;

		} else if(a >= 1.4 && i >= 14) {

			soma = soma + 1;

		} else if(a >= 1.7 && i >= 16) {

			soma = soma + 1; 
		}

		System.out.println(soma);
	}
}
}
