package src.academy.devdojo.estruturasCondicionais;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int dia;
        System.out.print("Digite um Numero Inteiro de 1 a 7: ");
        dia = read.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sextou!!");
                break;
            case 6:
                System.out.println("Sabadou!!");
                break;
            case 7:
                System.out.println("Domingou!! ZZZzzzZZZ");
                break;
            default:
                System.out.println("Entrada Invalida!!");
        }
    }


}

