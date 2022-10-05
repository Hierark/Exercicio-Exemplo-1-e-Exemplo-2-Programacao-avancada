public class exercicio46 {
    long long int fatorial(int n) {
        long long int resultado = 1;
        
        while (n > 1) {
            resultado *= n--;
        }
        
        return resultado;
    }
    
    int main() {
        
        int n, m;
        
        while (scanf("%d %d", &n, &m) != EOF)
            printf("%lld\n", fatorial(n) + fatorial(m));
        
        return 0;
    }
}
