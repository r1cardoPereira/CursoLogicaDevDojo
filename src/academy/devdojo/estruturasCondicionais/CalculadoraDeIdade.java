package src.academy.devdojo.estruturasCondicionais;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculadoraDeIdade {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a, b, c;
        System.out.print("Digite o ano atual: ");
        a = read.nextInt();
        System.out.printf("Digite o ano de Nascimento: ");
        b = read.nextInt();
        c = a - b;
        System.out.println("Sua idade é "+ c +" anos!");
    }
}
