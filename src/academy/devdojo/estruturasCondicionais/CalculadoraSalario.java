package src.academy.devdojo.estruturasCondicionais;

import java.util.Scanner;

public class CalculadoraSalario {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Double salario, imposto;
        String porcentagem ;

        System.out.print("Digite o Valor do seu salario R$: ");
        salario = read.nextDouble();
        if(salario >= 4500){
            imposto = salario * 0.30;
            porcentagem = "30%";
            System.out.println("O imposto de " +porcentagem+  " do seu salario é de R$: " + imposto);

        }else{
            imposto = salario * 0.15;
            porcentagem = "15%";
            System.out.println("O imposto de " +porcentagem+  " do seu salario é de R$: " + imposto);
        }

    }
}
