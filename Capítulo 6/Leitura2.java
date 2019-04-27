import java.util.Scanner;

public class Leitura2{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = ler.next();

        System.out.print("Digite um número real (tipo float): ");
        float num1 = ler.nextFloat();

        System.out.print("Digite um número real (tipo double): ");
        double num2 = ler.nextDouble();

        System.out.println(nome + "\n" + num1 + "\n" + num2 );
    }

}
