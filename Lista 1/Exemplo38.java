public class exercicio38 {
    import java.util.Scanner;
    public static void main (String[] args)  {
       Scanner teclado = new Scanner (System.in);
       int numero = 0, cont = 0;

       System.out.print("Digiteum número para ver se é primo: ");
       numero = teclado.nextInt();

       for (int i=1; i<=numero; i ++) {
        if(numero % 1 == 0) {
            cont++;
        }
     }

     if(cont == 2) {
        System.out.println("O numero "+numero+" é primo");
    }else{
        System.out.println("O numero "+numero+" não é primo");
    }
}