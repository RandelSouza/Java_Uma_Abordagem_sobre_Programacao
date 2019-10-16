import javax.swing.JOptionPane;

public class Exercicio2{
    public static String relatorio(String[] meses, String[] responsaveis){
        String resultado = "";

        resultado += "Relatório do Laboratório:\n";

        for(int mes = 0; mes < meses.length; mes++){
            resultado += "Mês "+(mes+1)+" "+meses[mes]+" : --> " + responsaveis[mes]+"\n";
        }

        return resultado;
    }

    public static void main(String[] args) {
        String[] meses = {"janeiro",
                          "fevereiro",
                          "março",
                          "abril",
                          "maio",
                          "junho",
                          "julho",
                          "agosto",
                          "setembro",
                          "outubro",
                          "novembro",
                          "dezembro"};

        String[] responsaveis = new String[meses.length];

        for(int mes = 0; mes < meses.length; mes++){
            responsaveis[mes] = JOptionPane.showInputDialog("Digitar nome do responsável pelo mês "+(mes+1) +" "+meses[mes]+": ");
        }

        JOptionPane.showMessageDialog(null, relatorio(meses, responsaveis));
    }
}
