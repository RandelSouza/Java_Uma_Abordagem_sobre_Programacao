import javax.swing.JOptionPane;

public class Exercicio6{
    public static void main(String[] args) {
        int numero = 0;
        boolean saida = false;

        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro, e descubra se é par ou impar: "));

            if(numero == 0){
                saida = true;
            }
            else if(numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "O número " + String.valueOf(numero) +" é Par!");
            }else{
                JOptionPane.showMessageDialog(null, "O número " + String.valueOf(numero) +" é Impar!");
            }
        }while(!saida);

    }
}
