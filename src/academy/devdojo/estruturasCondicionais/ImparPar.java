package src.academy.devdojo.estruturasCondicionais;

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        int numero,numero1;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        numero = read.nextInt();
        numero1 = numero % 2;

        if (numero1 == 0){
            System.out.println("O Numero "+numero + " É Par!!");
        }else{
            System.out.println("O Numero "+numero + " É Impar!!");
        }



    }
}
