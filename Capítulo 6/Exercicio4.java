import java.util.Scanner;

public class Exercicio4{

    public static void menu(){
        
        System.out.println("[ 1 ] Inserir novo paciente");
        System.out.println("[ 2 ] Inserir novo médico");
        System.out.println("[ 3 ] Marcar consulta");
        System.out.println("[ 4 ] Desmarcar consulta");
        System.out.println("[ 0 ] Sair");
    }

    public static void main(String[] args) {
        String nome  = "";
        int numero = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome: ");
        nome = entrada.nextLine();

    }
}
