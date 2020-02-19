import javax.swing.JOptionPane;

class TesteExemploData{
    public static void main(String[] args){
        int mes, ano;

        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o Mês de Nascimento: "));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano de Nascimento: "));

        ExemploData exemploData = new ExemploData(mes, ano);

        JOptionPane.showMessageDialog(null, exemploData.dataCompleta());
    }
}
