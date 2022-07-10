package src.academy.devdojo.lacosderepeticao.whilee;

import java.util.Scanner;

public class SistemaSalarioWhile {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int option = 0;
        while( option != 3){
            System.out.println("**********PROGRAMA**********");
            System.out.println("1. Calcular Imposto");
            System.out.println("2. Depositar salario");
            System.out.println("3. Sair");
            System.out.print("Digite uma Opção: ");
            option = read.nextInt();
        }
        System.out.println("*****PROGRAMA FINALIZADO*****");

    }
}
