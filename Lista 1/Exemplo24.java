import java.util.Scanner;

public class exercicio24 {

	public static void main(String[] args) {

		int primeiro, segundo, terceiro, quarto, quinto; 
		int valor;

		Scanner sc = new Scanner(System.in); 

		System.out.println("Informe um valor: ");
		valor = sc.nextInt(); 

		if(valor < 10000 && valor > 99999) {

			System.out.println("Valor inválido, Informe um número correto: "); 
			valor = sc.nextInt(); 
		}

		quinto = valor % 10; 
		valor /= 10; 

		quarto = valor % 10; 
		valor /= 10; 

		terceiro = valor % 10; 
		terceiro = terceiro + 0;
		valor /= 10;

		segundo = valor % 10;
		valor /= 10; 

		primeiro = valor % 10; 

		if(primeiro == quinto && segundo == quarto) {

			System.out.println("Sim");

		} else {

			System.out.println("Não");
		}
	}

}

