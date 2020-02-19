import javax.swing.JOptionPane;

public class TesteProduto{
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o Código: ")));
        produto.setDescricao(JOptionPane.showInputDialog("Digite a Descrição: "));
        produto.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o Preço: ")));
        produto.calcularFrete(JOptionPane.showInputDialog("Por favor informe: (I)nterior, (M)etropolitana, (L)itorial.").charAt(0));

        produto.setDtFabr(new DataFabricacao());

        produto.getDtFabr().setDia(28);
        produto.getDtFabr().setMes(3);
        produto.getDtFabr().setAno(1977);

        produto.exibirDados();
    }
}
