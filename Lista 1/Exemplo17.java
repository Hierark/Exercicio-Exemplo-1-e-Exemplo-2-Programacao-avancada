   import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 

		int n; 
		int a, b, d;
		int cont; 

		System.out.println("Informe um número: "); 
		n = sc.nextInt(); 

		for(a = 0; a < n; a++) {

			cont = 1; 

			System.out.println("Informe um outro número: "); 
			b = sc.nextInt();  

			for(d = 2; d < b; d++) {

				if(b % d == 0) {

					cont++; 
				}
			}

			if(cont == 1 &&  b!= 1) {

				System.out.println("O número: " + b + " é primo"); 

			} else {

				System.out.println("O número: " + b + " não é primo");
			}
		}
	}

}

