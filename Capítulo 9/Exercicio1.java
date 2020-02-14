import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class Exercicio1{
    static List<Integer> numeros = new ArrayList();

    public static int incrementaDois(int num){

        if (num > 40){
            return 0;
        }

        numeros.add(num);
        return num +  incrementaDois(num + 2);
    }
    
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 40: "));
        incrementaDois(num);
        JOptionPane.showMessageDialog(null, numeros.toString());
    }
}
