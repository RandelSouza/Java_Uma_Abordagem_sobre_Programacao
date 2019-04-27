import java.util.Scanner;

public class Leitura{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = ler.next();

        System.out.print("Digite um número inteiro (tipo byte): ");
        byte num1 = ler.nextByte();

        System.out.print("Digite um número inteiro (tipo short): ");
        short num2 = ler.nextShort();

        System.out.print("Digite um número inteiro (tipo int): ");
        int num3 = ler.nextInt();

        System.out.print("Digite um número inteiro (tipo long): ");
        long num4 = ler.nextInt();

        System.out.println(nome + "\n" + num1 + "\n" + num2 + "\n" + num3 + "\n" + num4



         );
    }

}
