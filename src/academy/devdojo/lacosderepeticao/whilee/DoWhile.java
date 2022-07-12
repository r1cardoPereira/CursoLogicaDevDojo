package src.academy.devdojo.lacosderepeticao.whilee;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner read = new Scanner(System.in);
        do {
            System.out.print("PLAYER 1 Digite um numero de 1 a 10: ");
            int num1 = read.nextInt();
            System.out.print("PLAYER 2 Digite um numero de 1 a 10: ");
            int num2 = read.nextInt();
             System.out.println("Acertou  " + (num1 == num2));
            System.out.println("***************************************************");
             System.out.println("Deseja Continuar Jogando? ");
            System.out.println(" 1. Sim");
            System.out.println(" 2. Não");
            desejaContinuar = read.nextInt();



        }while (desejaContinuar == 1);

    }
}
