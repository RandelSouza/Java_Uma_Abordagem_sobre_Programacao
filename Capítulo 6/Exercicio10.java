import javax.swing.JOptionPane;

public class Exercicio10{

    public static boolean paridade(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int numero = 0;

        while(true){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro, e descubra se é par ou impar: "));

            if(numero == 0){
                break;
            }

            if ( paridade(numero)){
                JOptionPane.showMessageDialog(null, "O número " + String.valueOf(numero) +" é Par!");
            }else{
                JOptionPane.showMessageDialog(null, "O número " + String.valueOf(numero) +" é Impar!");
            }
        }
    }
}
