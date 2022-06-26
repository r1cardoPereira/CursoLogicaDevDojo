package src;

import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int idade;
        String nome;
        System.out.print("Digite seu Nome: ");
        nome = read.nextLine();
        System.out.print("Digite sua Idade: ");
        idade = read.nextInt();
        if (idade < 10) {
            System.out.println(nome + " Participará da categoria Infantil!");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " Participará da categoria Juvenil!");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " Participará da categoria Pré-Adulto!");
        } else {
            System.out.println(nome + " Participará da categoria Adulto!");
        }
    }
}
