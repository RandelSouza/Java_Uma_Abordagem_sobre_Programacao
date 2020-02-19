import javax.swing.JOptionPane;

class TesteDataFabricacao{
    public static void main(String[] args){
        DataFabricacao dataFabricacao = new DataFabricacao();
        dataFabricacao.setMes(Integer.parseInt(JOptionPane.showInputDialog("Informe o Mês: ")));
        dataFabricacao.setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano: ")));
        dataFabricacao.setDia(Integer.parseInt(JOptionPane.showInputDialog("Informe o Dia: ")));

        JOptionPane.showMessageDialog(null, dataFabricacao. dataCompleta());
    }
}
