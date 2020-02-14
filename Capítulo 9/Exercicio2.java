import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class Exercicio2{
    static List<Integer> sequencia = new ArrayList();

    public static void fibonacci(int num){
        int ultimo = 0;
        int penultimo = 1;
        int resultado = 0;

        if(num <= 1){
            sequencia.add(1);
        }else{
            for(int i = 0; i < num; i++){
                resultado = ultimo + penultimo;
                penultimo = ultimo;
                ultimo = resultado;
                sequencia.add(resultado);
            }
        }
    }

    public static void main(String[] args) {
        fibonacci(20);
        JOptionPane.showMessageDialog(null, sequencia.toString());
    }
}
