import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CarrinhoCompras{
    List<Produto2> listaProd = new ArrayList<Produto2>();

    public void adicionarProd(Produto2 prod){
        listaProd.add(prod);
    }
}
