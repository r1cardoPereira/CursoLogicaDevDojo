//CODIGO COPIADO

import java.util.Scanner;
import java.text.DecimalFormat;
 
public class salaryCalculator {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        double salario, porcentagemSalario;

        System.out.println("Informe seu salario: ");
        salario = read.nextDouble();
        porcentagemSalario = salario * 0.50;
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println("A valor equivalente a 50% do seu salario é: " + formatador.format(porcentagemSalario)+"R$");
    }


}
