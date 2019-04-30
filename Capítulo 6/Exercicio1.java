// import java.util.Scanner;
import java.io.Console; // Similar ao Scanner

public class Exercicio1{
    public static void main(String[] args) {
        String nome_usuario = "";
        String senha = "";
        String senha_confirmacao = "";

        Console console = System.console(); // aqui ficaria o Scanner(System.in);
        nome_usuario = console.readLine("Insira o nome de Usuário: ");
        senha = new String(console.readPassword("Insira a nova senha: "));
        senha_confirmacao = new String(console.readPassword("Repita a nova senha: "));

        if( senha.equals(senha_confirmacao) ){
             System.out.println("Senha alterada com sucesso!");
        }else{
             System.out.println("Nova senha não confirmada!");
        }

    }
}
