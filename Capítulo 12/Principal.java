import javax.swing.JOptionPane;

public class Principal{
    public static void main(String[] args) {
        Atleta atleta = new Atleta();

        atleta.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o Código: ")));
        atleta.setNome(JOptionPane.showInputDialog("Digite o Nome: "));
        atleta.setEsporte(JOptionPane.showInputDialog("Digite o Esporte: "));
        atleta.setValorPatrocinio(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de Patrocínio: ")));

        JOptionPane.showMessageDialog(null, "Código: " + atleta.getCodigo() + "\n" +
                                            "Nome: " + atleta.getNome() + "\n" +
                                            "Esporte: " + atleta.getEsporte() + "\n" +
                                            "Valor Patrocínio: " + atleta.getValorPatrocinio()
        );
    }
}
