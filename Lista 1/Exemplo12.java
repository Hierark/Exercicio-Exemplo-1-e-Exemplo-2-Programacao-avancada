    import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {

		String palavra1, palavra2, palavra3; 

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a primeira palavra sobre animais: "); 
		palavra1 = sc.next(); 

		System.out.println("Informe a segunda palavra sobre animais: "); 
		palavra2 = sc.next(); 

		System.out.println("Informe a terceira palavra sobre animais: "); 
		palavra3 = sc.next(); 

		if(palavra1.equalsIgnoreCase("vertebrado")) {

			if(palavra2.equalsIgnoreCase("ave")) {

				if(palavra3.equalsIgnoreCase("carnívoro")) {

					System.out.println("é uma águia"); 

				} else if (palavra3.equalsIgnoreCase("ónivoro")) {

					System.out.println("é uma pomba");
				}

			}  else if(palavra2.equalsIgnoreCase("mamiféro")) {

				if(palavra3.equalsIgnoreCase("onívoro")) {

					System.out.println("homem"); 

				} else if(palavra3.equalsIgnoreCase("herbívoro")) {

					System.out.println("vaca");
				}
			}
		}

		if(palavra1.equalsIgnoreCase("invertebrado")) {

			if(palavra2.equalsIgnoreCase("inseto")) {

				if(palavra3.equalsIgnoreCase("hematofago")) {

					System.out.println("pulga"); 

				} else if(palavra3.equalsIgnoreCase("herbívoro")) {

					System.out.println("lagarta");
				}

			} else if(palavra2.equalsIgnoreCase("anelídeo")) {

				if(palavra3.equalsIgnoreCase("hematofago")) {

					System.out.println("sanguessuga"); 

				} else if(palavra3.equalsIgnoreCase("onívoro")) {

					System.out.println("minhoca");
				}
			}
		}
	}
}

