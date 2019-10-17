import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Lista2{
    public static void main(String[] args) {
        List lista = new ArrayList();

        JOptionPane.showMessageDialog(null, "Exemplo de ordenação de um ArrayList");

        for(int i = 0; i < 3; i++){
            lista.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: ")));
        }

        JOptionPane.showMessageDialog(null, "Lista como foi digitada: " + lista);
        Collections.sort(lista);
        JOptionPane.showMessageDialog(null, "Lista ordenada: " + lista);        
    }
}
