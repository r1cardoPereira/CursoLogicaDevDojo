package src.academy.devdojo.lacosderepeticao;

import java.util.Scanner;

public class Aula02exercicio {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int num = read.nextInt();
        int i = 0;
        while (i <= num){
            if (i % 2 !=0){
                System.out.println("i = "+ i);

            }
            i += 1;
        }



        }

    }

