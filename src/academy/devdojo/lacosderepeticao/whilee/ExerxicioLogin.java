package src.academy.devdojo.lacosderepeticao.whilee;
//recomeçar na aula 32!

import java.util.Scanner;

public class ExerxicioLogin {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        final String login = "RicardoPereiraJr";
         final String password = "Binho2022";
         while(true){
             System.out.print("Digite o seu Login: ");
             String loginDigitado = read.nextLine();
             System.out.print("Digite sua Senha: ");
             String passwordDigitado = read.nextLine();
             if(loginDigitado.equals(login) && passwordDigitado.equals(password) ){
                 System.out.println("ACESSO CONCEDIDO!!");
                 break;
             }
                 System.out.println("ACESSO NEGADO!! TENTE NOVAMENTE");


         }
        System.out.println("LOGIN EFETUADO COM SUCESSO!!");
    }
}
