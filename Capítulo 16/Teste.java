import javax.swing.JOptionPane;

public class Teste{
    public static void main(String[] args) {
        DataFabricacao dtFabrPadrao = new DataFabricacao();
        dtFabrPadrao.setDia(17);
        dtFabrPadrao.setMes(06);
        dtFabrPadrao.setAno(2013);
        JOptionPane.showMessageDialog(null, "Primeira data: " + dtFabrPadrao.dataCompleta());

        DataFabricacao dtFabrNova = new DataFabricacao(18, 06, 2013);
        JOptionPane.showMessageDialog(null, "Um dia depois: " + dtFabrNova.dataCompleta());


    }
}
