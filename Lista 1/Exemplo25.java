import java.util.Scanner;

public class exercicio25 {

	public static void main(String[] args) {

		int[] requisitos = new int[5]; 
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < requisitos.length; i++) {

			System.out.printf("Informe o [%d] registro: ", i);
			requisitos[i] = sc.nextInt(); 

			if(requisitos[i] < 0 || requisitos[i] > 1) {

				System.out.println("Inválido"); 
				break;
			}
		}

		if( requisitos[2] == 1) {

			System.out.println("Avaliados"); 

		} else {

			System.out.println("0 (Zero)");
		}

	}
}
    

