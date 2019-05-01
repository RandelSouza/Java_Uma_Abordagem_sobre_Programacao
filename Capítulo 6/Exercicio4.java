import java.util.Scanner;

public class Exercicio4{

    public static void menu(){
        System.out.println("[ 1 ] Inserir novo paciente");
        System.out.println("[ 2 ] Inserir novo médico");
        System.out.println("[ 3 ] Marcar consulta");
        System.out.println("[ 4 ] Desmarcar consulta");
        System.out.println("[ 0 ] Sair\n");
    }

    public static void main(String[] args) {
        int opcao  = 0;
        Scanner entrada = new Scanner(System.in);

        do{
            menu();
            System.out.print("Digite sua opção: ");

            try{
                opcao = Integer.parseInt(entrada.nextLine());
            }catch(NumberFormatException nfe){
                opcao = 0;
            }

            System.out.println("\n");

            switch(opcao){
                case 1:
                    System.out.println("Inserindo novo paciente.");
                    break;
                case 2:
                    System.out.println("Inserindo novo médico.");
                    break;
                case 3:
                    System.out.println("Marcando consulta.");
                    break;
                case 4:
                    System.out.println("Desmarcando consulta.");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("O valor utilizado para a opção não é válido!");
                    break;
            }

            System.out.println("\n");
        }while(opcao != 0);

    }
}
