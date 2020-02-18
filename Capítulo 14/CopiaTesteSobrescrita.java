import javax.swing.JOptionPane;

public class CopiaTesteSobrescrita{
    public static void main(String[] args) {
        Atleta atleta = new Atleta();
        Corredor corredor = new Corredor();

        atleta.setValorPatrocinio(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de patrocínio do Atleta: ")));
        corredor.setValorPatrocinio(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de patrocínio do Corredor: ")));

        atleta.atualizarValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de aumento do Atleta: ")));
        corredor.atualizarValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de aumento do Corredor: ")));

        // Porém com resultados diferentes
        System.out.println("Novo salário de Atleta: " + atleta.getValorPatrocinio());
        System.out.println("Novo salário de Corredor: " + corredor.getValorPatrocinio());
    }
}
