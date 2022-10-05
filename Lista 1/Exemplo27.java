import java.util.Scanner;

public class exercicio27{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] medicoes = new double[4]; 

		double media_aritmetica = 0; 

		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < medicoes.length; i++) {

			System.out.printf("Informe a [%d] Medição para a taxa de glicose: ", i); 
			medicoes[i] = sc.nextDouble(); 

			media_aritmetica = medicoes[i] + medicoes[i] + medicoes[i] + medicoes[i] / 4;

			if(medicoes[i] < 110) {

				System.out.println("Taxa de Glicose Normal"); 

			} else if(medicoes[i] < 125) { 

				System.out.println("Taxa de Glicose Alterada"); 

			} else if(medicoes[i] > 125) {

				System.out.println("Taxa de Glicose Muito Alta"); 
			}
		}

		System.out.printf("Média das Leituras: %.2f", media_aritmetica);

	}

}

