package src;


import java.util.Scanner;

public class CadastroUsuarioUsandoOr {

    public static void main(String[] args) {
        String user;
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o nome do Usuário: ");
        user = read.nextLine();
        if (user.equalsIgnoreCase("admin") || user.equalsIgnoreCase("administrador") || user.equals("")) {
            System.out.println("Usuário Inválido!");
        }else {
            System.out.println(user + " cadastrado com sucesso!");
        }

    }

}
