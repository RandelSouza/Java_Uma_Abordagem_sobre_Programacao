import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args) {
        String nome, sobrenome, logradouro = "";
        int numero = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        sobrenome = entrada.nextLine();

        System.out.print("Digite o seu endereco na forma de Logradouro: ");
        logradouro = entrada.nextLine();

        System.out.print("Digite o seu número: ");
        numero = Integer.parseInt(entrada.nextLine());

        System.out.print("Nome: " + nome +", "+"Sobrenome: " + sobrenome+", "
                        +"Logradouro: " + logradouro+", "+"Número: " + numero);
    }
}
