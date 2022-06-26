package src;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraImpostoDeRenda {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");
        double salario, aliquota;

        System.out.print("Digite o seu Salario com 2 casas decimais R$: ");
        salario = read.nextDouble();
        if (salario <= 1903.98) {
            System.out.println("Voçê está ISENTO de Imposto!!");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            aliquota = 7.5;
            System.out.println("Seu Salário foi de R$: " + salario + " Recebeu  Alíquota do IRPF de " + aliquota + "%");
            System.out.println("Parcela dedutivél é de R$: " + formatador.format ((1903.99 * aliquota) / 100));
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            aliquota = 15.0;
            System.out.println("Seu Salário foi de R$: " + salario + " Recebeu Alíquota de IRPF de " + aliquota + "%");
            System.out.println("Parcela dedutivél é de R$: " +formatador.format ((2826.66 * aliquota) / 100));
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            aliquota = 22.5;
            System.out.println("Seu Salário foi de R$: " + salario + " Recebeu Alíquota de IRPF de " + aliquota + "%");
            System.out.println("Parcela dedutivél é de R$: " + formatador.format((3751.06 * aliquota) / 100));
        }else{
            aliquota = 27.5;
            System.out.println("Seu Salário foi de R$: " + salario + " Recebeu Alíquota de IRPF de " + aliquota + "%");
            System.out.println("Parcela dedutivél é de R$: " + formatador.format ((4664.68 * aliquota) / 100));
        }
    }
}
