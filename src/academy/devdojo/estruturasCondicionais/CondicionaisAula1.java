package src.academy.devdojo.estruturasCondicionais;

import java.util.Scanner;

public class CondicionaisAula1 {
    public static void main(String[] args) {
        System.out.println("**CALCULADORA DE JUROS COMPOSTOS**");
        int dias = 0;
        double valor = 0.01;
        while (dias <= 30) {
            System.out.println("No dia " + dias + " seu dinheiro rendeu R$: " + valor);
            dias = dias + 1;
            valor = valor * 2;

        }
        System.out.println("***FINAL***");

    }

}


