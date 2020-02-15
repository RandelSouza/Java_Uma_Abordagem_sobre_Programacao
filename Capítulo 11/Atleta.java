import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Atleta{
    public int codigo;
    public String nome;
    public String esporte;
    public double valorPatrocinio;

    /*@override*/
    public String toString(){
        return "Código: " + this.codigo + "\n" +
               "Nome: " + this.nome + "\n" +
               "Esporte: " + this.esporte + "\n" +
               "Valor de Patrocinio: " + NumberFormat.getCurrencyInstance().format(this.valorPatrocinio);
    }

    public void inserirDados(){
        this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código: "));
        this.nome = JOptionPane.showInputDialog("Digite o Nome: ");
        this.esporte = JOptionPane.showInputDialog("Digite o Esporte: ");
        this.valorPatrocinio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Patrocínio: "));
    }

    public void atualizarValor(double taxa){
        this.valorPatrocinio = this.valorPatrocinio + (this.valorPatrocinio * taxa / 100);
    }

    public void mostrar(){
        JOptionPane.showMessageDialog(null, this.toString());
    }
}
