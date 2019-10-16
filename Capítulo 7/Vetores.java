import javax.swing.JOptionPane;

public class Vetores{
    public static void main(String[] args) {
        int[] idades = new int[6];
        String[] respostas = {"SIM","sim"};
        String pergunta = "";

        for(int i = 0; i < 6; i++){
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade: "));
            
            if(i != 5){
                pergunta = JOptionPane.showInputDialog("Deseja continuar?: ");

                if(! ( pergunta.equals(respostas[0]) || pergunta.equals(respostas[1])) ){
                    break;
                }
            }
        }
    }
}
