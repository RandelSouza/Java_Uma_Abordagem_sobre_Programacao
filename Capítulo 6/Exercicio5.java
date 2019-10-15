import javax.swing.JOptionPane;

public class Exercicio5{
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro, e descubra se é par ou impar: "));

        if(numero % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número " + String.valueOf(numero) +" é Par!");
        }else{
            JOptionPane.showMessageDialog(null, "O número " + String.valueOf(numero) +" é Impar!");
        }
    }
}
