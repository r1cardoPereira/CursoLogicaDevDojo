package src.academy.devdojo.variaveis;

import java.util.Scanner;

public class CalculatorAgeDiference {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int idade1, idade2, diferenca;

        System.out.println("Digite a primeira idade: ");
        idade1 = sc.nextInt();
        System.out.println("Digite a segunda idade: ");
        idade2 = sc.nextInt();

        diferenca = idade1 - idade2;
        System.out.printf("A diferença de idade é "+diferenca + " anos");


    }

}
