public class exercicio50 {
    int ProcuraNumero(int, int);

    int main(void)
    {
        int n_andar , i, treze, quatro;
    
        printf("\nNumero do andar: ");
        scanf("%i", &n_andar);
    
        for (i = 0; i < n_andar; i++)
        {
            treze = ProcuraNumero(13, n_andar);
    
            quatro = ProcuraNumero(4, n_andar);
    
            if ((quatro == 1) || (treze == 1))
            {
                n_andar += 1;
            }
        }
    
        printf("\nNovo numero do andar: %i\n\n", n_andar);
    }
    
    int ProcuraNumero(int NumeroProcurado, int NumeroAlvo)
    {
        int resultado;
    
        char NumeroProcuradoString[16];
        char NumeroAlvoString[16];
    
        sprintf(NumeroProcuradoString, "%d", NumeroProcurado);
        sprintf(NumeroAlvoString, "%d", NumeroAlvo);
    
        resultado = strstr(NumeroAlvoString, NumeroProcuradoString) != NULL ? 1 : 0;
    
        return resultado;
    }

}
}
