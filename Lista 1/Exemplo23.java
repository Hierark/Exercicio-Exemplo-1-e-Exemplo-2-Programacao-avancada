import java.util.Scanner;


public class exercicio23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x; 
		int y; 

		System.out.println("Informe o valor de x: "); 
		x = sc.nextInt(); 

		System.out.println("Informe o valor de y: ");
		y = sc.nextInt(); 

		if(x > y) { 

			System.out.println("Valor verdadeiro:  " + 1); 

		} else {

			System.out.println("Valor Falso: " + 0); 
		}

		if(x == y) {

			System.out.println("Valor Verdadeiro: " + 1); 

		} else {

			System.out.println("Valor Falso: " + 0);
		}

		if(x < y) {

			System.out.println("Valor Verdadeiro: " + 1);

		} else {

			System.out.println("Valor Falso: " + 0);
		} 

		if(x != y) {

			System.out.println("Valor Verdadeiro: " + 1);

		} else {

			System.out.println("Valor Falso: " + 0);
		} 

		if(x >= y) {

			System.out.println("Valor Verdadeiro: " + 1);

		} else {

			System.out.println("Valor Falso: " + 0);
		}

		if(x <= y) {

			System.out.println("Valor Verdadeiro: " + 1);

		} else {

			System.out.println("Valor Falso: " + 0);
		}

	}

}

