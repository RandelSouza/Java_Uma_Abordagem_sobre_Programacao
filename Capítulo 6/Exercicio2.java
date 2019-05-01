import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args) {
        double cotacao = 0.0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual a cotação para o dia de hoje?: ");
        cotacao = (Float.parseFloat(entrada.nextLine()) * 3.92);
        System.out.println("O valor da cotação em reais é: " + cotacao);
    }
}
