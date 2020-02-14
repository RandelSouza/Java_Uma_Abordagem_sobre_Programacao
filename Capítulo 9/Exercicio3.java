import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para cálculo de Fatorial: "));
        long resposta =  num;

        for(int i = num-1; i > 1; i--){
            resposta *= i;
        }

        JOptionPane.showMessageDialog(null, "O Fatorial é: " + resposta);
    }
}
