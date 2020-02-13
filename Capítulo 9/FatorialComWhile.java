import javax.swing.JOptionPane;

public class FatorialComWhile {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para cálculo de Fatorial: "));
        long resposta = 1;

        while (num > 1){
            resposta *= num;
            num--;
        }

        JOptionPane.showMessageDialog(null, "O Fatorial é: " + resposta);
    }
}
