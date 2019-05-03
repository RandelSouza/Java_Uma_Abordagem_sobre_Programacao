import java.util.Scanner;

public class Leitura3{
    // classe leitura 3 exemplo de execuço
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = ler.nextLine();

        System.out.print("Digite seu endereço: ");
        String endereco = ler.nextLine();

        System.out.print("Digite seu recado: ");
        String recado = ler.nextLine();

        System.out.println("Resultado: " + "\n"+ nome + "\n" + endereco + "\n" + recado);
    }

}
