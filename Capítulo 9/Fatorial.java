import javax.swing.JOptionPane;

public class Fatorial{
    public static long fatorial(int num){
        if( num == 0 || num == 1){
            return 1;
        }else{
            return num *  fatorial(num -1);
        }
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para cálculo de Fatorial: "));
        long resposta = fatorial(num);
        JOptionPane.showMessageDialog(null, "O Fatorial é: " + resposta);
    }
}
