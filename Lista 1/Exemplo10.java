public class exercicio10 {

    import java.util.Scanner 
    public static void main(String[] args) {
            // TODO Auto-generated method stub
    
        int ano, mes, dia, numero;
    
        Scanner sc = new Scanner(System.in);
    
            System.out.println("Informe um número: ");
            numero = sc.nextInt(); 
    
            ano = numero / 365; 
            mes = (numero % 365) / 30;
            dia = (numero % 365) % 30; 
    
            System.out.printf("%d ano(s) \n", ano);
            System.out.printf("%d mes(s) \n", mes);
            System.out.printf("%d dia(s) \n", dia);
    
        }
    
    } 

