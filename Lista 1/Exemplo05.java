 
    import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		int a, b, c; 

		Scanner letra = new Scanner(System.in);

		System.out.println("Informe o primeiro número: "); 
		a = letra.nextInt(); 

		System.out.println("Informe o segundo número: ");
		b = letra.nextInt(); 

		System.out.println("Informe o terceiro número: "); 
		c = letra.nextInt(); 

		if(a < b) {

			if(b < c) {

				System.out.println("A ordem é: " + a + "," + b + "," + c);

			} else if (a < c) {

				System.out.println("A ordem é: " + a + "," + c + "," + b);

			} else { 

				System.out.println("A ordem é: " + c + "," + a + "," + b);
			}
		} else if(b < c) {

			if(a < c) {

				System.out.println("A ordem é: " + b + "," + a + "," + c); 

			} else {

				System.out.println("A ordem é: " + b + "," + c + "," + a); 
			}

		} else {

			System.out.println("A ordem é: " + c + "," + b + "," + a);
		}
	}
}

