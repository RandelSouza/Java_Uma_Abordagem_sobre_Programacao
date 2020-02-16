import javax.swing.JOptionPane;

public class TestaProduto{
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o Código: ")));
        livro.setDescricao(JOptionPane.showInputDialog("Digite a Descrição: "));
        livro.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o Preço: ")));

        livro.exibirDados();
    }
}
