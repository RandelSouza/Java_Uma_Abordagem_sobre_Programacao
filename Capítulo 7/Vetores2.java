import javax.swing.JOptionPane;

public class Vetores2{
    public static void main(String[] args) {
        int[] idades = new int[6];
        String[] respostas = {"SIM","sim"};
        String pergunta = "";

        for(int i = 0; i < 6; i++){
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade: "));

            if(i != 5){
                pergunta = JOptionPane.showInputDialog("Deseja continuar?: ");

                if(!(pergunta.equals(respostas[0]) || pergunta.equals(respostas[1])) ){
                    break;
                }
            }
        }

        System.out.println("Exibindo os resultados: ");

        for(int i = 0; i < idades.length; i++){
            System.out.println((i+1)+"º idade --> "+ idades[i]);
        }
    }
}
