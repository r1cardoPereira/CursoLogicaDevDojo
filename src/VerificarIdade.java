import java.util.Scanner;

public class VerificarIdade {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua Idade: ");
        idade = read.nextInt();
        if(idade >= 18){
            System.out.println("Voçê é Maior de idade");
        }else {
            System.out.println("Infelizmente Voçê é menor de idade");
        }
    }
}
