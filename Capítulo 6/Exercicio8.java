import javax.swing.JOptionPane;

public class Exercicio8{

    public static void paridade(int num){

        if(num % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número " + String.valueOf(num) +" é Par!");
        }else{
            JOptionPane.showMessageDialog(null, "O número " + String.valueOf(num) +" é Impar!");
        }
    }

    public static void main(String[] args) {
        int numero = 0;

        while(true){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro, e descubra se é par ou impar: "));

            if(numero == 0){
                break;
            }

            paridade(numero);
        }
    }
}
