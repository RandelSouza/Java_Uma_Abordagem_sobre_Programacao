import javax.swing.JOptionPane;

public class Exercicio9{

    public static String paridade(int num){

        if(num % 2 == 0){
            return "O número " + String.valueOf(num) +" é Par!";
        }

        return "O número " + String.valueOf(num) +" é Impar!";
    }

    public static void main(String[] args) {
        int numero = 0;

        while(true){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro, e descubra se é par ou impar: "));

            if(numero == 0){
                break;
            }

            JOptionPane.showMessageDialog(null, paridade(numero) );
        }
    }
}
