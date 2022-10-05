public class exercicio49 {
    int main(){
        float peso,altura,imc;

        printf("Peso: ");
        scanf("%f",peso);
        printf("Altura: ");
        scanf("%f",altura);

        imc=peso/(altura*2);

        if (imc<20){
                    printf("Abaixo do peso");
        }            
        else if (imc>=20 && imc<25){
                printf("Peso normal");
        }
        else if (imc>=25 && imc<30){
                printf("Sobre Peso");
        }
        else if (imc>30 && imc<=40){
                 printf("Obeso");
        }
        else if (imc>40){
                    printf("Obeso Mórbido");
        }
}                  
}
