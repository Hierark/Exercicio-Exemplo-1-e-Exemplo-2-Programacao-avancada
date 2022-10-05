
import java.util.Scanner;

public class exercicio22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 

		int N; 
		double valor = 0; 

		System.out.println("Informe um número: "); 
		N = sc.nextInt(); 

		if( N <= 10) {

			valor = 7;


		} else if(N > 11 && N < 30) {

			valor = (N - 10) * 1 + 7;


		} else if(N > 31 && N < 100) {

			valor = (N - 30) * 2 + 7;

		} else {

			valor = (N - 100) * 5 + 167;
		}

		System.out.printf("Valor é: %.2f R$", valor); 
	}
}