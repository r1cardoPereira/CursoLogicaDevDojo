package src.academy.devdojo.estruturasCondicionais;

import java.util.Scanner;

public class ProgramaDeAlistamentoMilitar {
    public static void main(String[] args) {
        String sex;
        int age;

        Scanner read = new Scanner(System.in);
        System.out.print("Digite Sua Idade: ");
        age = read.nextInt();
        System.out.print("Digite seu Sexo M/F: ");
        sex = read.next();
        if (sex.equalsIgnoreCase("M") && age < 18 || sex.equalsIgnoreCase("F") && age < 18) {
            System.out.println("Alistamento não Permitido!!");
        } else if (sex.equalsIgnoreCase("F") && age >= 18) {
            System.out.println("Deseja se Alistar? ");
        } else if (sex.equalsIgnoreCase("M") && age >= 18) {
            System.out.println("Alistamento Obrigatório!!");

        } else {
            System.out.println("Dados Invalidos, Tente nomamente!!");
        }

    }
}
