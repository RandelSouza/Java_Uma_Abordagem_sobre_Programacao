import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Livro extends Produto{
    public void exibirDados(){
        JOptionPane.showMessageDialog(null, "Código: " + this.getCodigo() + "\n" +
                                            "Descrição: " + this.getDescricao() + "\n" +
                                            "Preço: " + NumberFormat.getCurrencyInstance().format(this.getPreco())
        );
    }
}
