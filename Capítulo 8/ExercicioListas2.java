import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import javax.swing.JOptionPane;

public class ExercicioListas2{
    public static void main(String[] args) {
        List<Double> salarios = new ArrayList();
        boolean condicao_parada = false;
        int contador = 1;
        String salario = "";
        Double soma = 0.0;

        do{
            salario = JOptionPane.showInputDialog("Salário do "+contador+"° mês: ");
            salario = (!salario.isEmpty() && !salario.equals("0.0")) ? salario : "0";

            if (!salario.equals("0")){
                salarios.add(Double.parseDouble(salario));
                contador += 1;
            }else{
                condicao_parada = true;
            }
        }while(!condicao_parada);


        for (int valor=0; valor < salarios.size(); valor++){
            soma += salarios.get(valor);
        }

        JOptionPane.showMessageDialog(null, "A média salarial é: " + (soma/salarios.size()));
    }
}
