import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double popA; 
		double popB;

		double contador = 0; 

		Scanner sc = new Scanner(System.in); 

		System.out.println("Informe a Taxa de População do país A: "); 
		popA = sc.nextDouble(); 

		System.out.println("Informe a Taxa de População do país B: "); 
		popB = sc.nextDouble(); 

		while(popB > popA) {

			popA += (popA * 3) / 100; 
			popB += (popB * 1.5) / 100; 

			contador++; 
		}

		System.out.println("Taxa de Anos da População: " + contador + " anos.");
	}

}

