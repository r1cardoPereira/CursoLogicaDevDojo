package src.academy.devdojo.estruturasCondicionais.swith;

import java.util.Scanner;

public class TipoDeConta {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite seu tipo de conta:  1-CONTA_POUPANÇA  2-CONTA_CORRENTE  3-CONTA_INVESTIMENTO: ");
        int conta = read.nextInt();
        switch (conta){
            case 1:
                System.out.println("0.05%");
                break;
            case 2:
                System.out.println("0.02%");
                break;
            case 3:
                System.out.println("0.01%");
                break;
            default:
                System.out.println("Tipo de Conta Invalida!!");
        }
    }
}
