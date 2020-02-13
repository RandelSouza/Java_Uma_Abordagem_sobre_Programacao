import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import javax.swing.JOptionPane;

public class ExercicioListas{
    public static void main(String[] args) {
        List listaMes = new ArrayList();
        List listaDiretor = new ArrayList();

        listaMes.add("Janeiro");
        listaMes.add("Fevereiro");
        listaMes.add("Março");

        for (int mes=0; mes < listaMes.size(); mes++){
            listaDiretor.add(JOptionPane.showInputDialog("Qual o nome do diretor do mês "+listaMes.get(mes)+" : "));
        }

        Collections.sort(listaDiretor);
        JOptionPane.showMessageDialog(null, "Lista de diretores ordenada: " + listaDiretor);
    }
}
