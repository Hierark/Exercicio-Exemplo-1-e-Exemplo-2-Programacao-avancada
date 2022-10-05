public class exercicio1 {
            public static void main(String[] args) {
    
            Scanner nota = new Scanner(System.in);
    
            double a, b, media; 
    
            System.out.println("Informe a nota A ?"); 
            a = nota.nextDouble(); 
    
            System.out.println("Informe a nota B ?"); 
            b = nota.nextDouble(); 
    
            media = ((3.5 * a) + (7 * b)) / 11; 
    
            System.out.printf("A média Ponderada é: %.5f", media);
        }
    
    }

