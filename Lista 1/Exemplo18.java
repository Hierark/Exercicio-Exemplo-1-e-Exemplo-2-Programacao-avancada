import java.util.Scanner;

public class exercicio18{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n; 
		int j = 0; 

		System.out.println("Informe um número: "); 
		n = sc.nextInt(); 

		while(n > j) {

			j *= 10;
			j += (n % 10); 
			n /= 10; 

		}

		System.out.println("Número invertido: " + j);
	}

}

