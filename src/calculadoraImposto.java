import java.util.Scanner;

public class calculadoraImposto {
    public static void main(String[] args){
        float salary = 2456.87f;
        float porcentagem = 30;
        float resultado;

       resultado = salary * porcentagem / 100;
        System.out.printf("%.2f  \n",resultado);
       porcentagem = porcentagem - 15;
       resultado = salary * porcentagem / 100;
       System.out.printf("%.2f\n",resultado);
       porcentagem = porcentagem -10;
       resultado = salary * porcentagem /100;
       System.out.printf("%.2f\n",resultado);





    }

}
