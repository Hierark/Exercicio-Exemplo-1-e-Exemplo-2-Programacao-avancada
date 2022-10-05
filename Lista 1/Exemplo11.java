import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hora_inicial, hora_final;
		int duracao_jogo; 

		Scanner sc = new Scanner(System.in); 

		System.out.println("informe a hora que vai começar o jogo: ");
		hora_inicial = sc.nextInt(); 

		System.out.println("Informe a hora que vai encerrar o jogo: "); 
		hora_final = sc.nextInt(); 

		if (hora_inicial > hora_final) {

			duracao_jogo = (24 - (hora_inicial - hora_final)); 

			System.out.println("O Jogo durou: " + duracao_jogo + " HORAS(S) ");

		} else if (hora_final > hora_inicial) {

			duracao_jogo = (hora_final - hora_inicial); 
			System.out.println("O Jogo durou: " + duracao_jogo + " HORAS(S) ");

		} else {

			System.out.println(" O Jogo durou 24 horas. ");
		}
	}

}

