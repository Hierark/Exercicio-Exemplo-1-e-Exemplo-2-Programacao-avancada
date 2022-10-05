public class exercicio48 {
    int main(){
        int idade, dosagem, gotas:
        float peso;

        scanf("%d", &idade);
        scanf("%f", &peso);

        if(idade<12){
           if(peso>=5 && peso<=9)
                dosagem = 125 ;
            else if(peso>=9.1 && peso<=16)
                dosagem = 250 ;
            else if(peso>=16.1 && peso<=24)
                dosagem = 375 ;
            else if(peso>=24.1 && peso<=30)
                dosagem = 500 ;
            else if(peso>30)
                dosagem = 750 ;

        }else{
            if(peso>=60)
               dosagem = 1000;
            else
                dosagem = 875;

        }
        gotas = (20*dosagem)/500;

        printf("Gotas: %d/n" , gotas);

        system("pause");
        return 0;
    }
}
