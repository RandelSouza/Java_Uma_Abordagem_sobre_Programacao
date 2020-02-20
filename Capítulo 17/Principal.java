import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Principal{
    public static void main(String[] args) {
        Produto prod = new Produto();

        prod.setDescricao("Lote de Livros Didáticos");
        prod.calcularFrete(30);
        System.out.println(prod.getDescricao() + " serão entregues a um custo de " + NumberFormat.getCurrencyInstance().format(prod.getFrete()));

        Produto prod2 = new Produto();

        prod2.setDescricao("Livros Sobre Oceanografia");
        prod2.calcularFrete('L');
        System.out.println(prod2.getDescricao() + " serão entregues a um custo de " + NumberFormat.getCurrencyInstance().format(prod2.getFrete()));
    }
}
