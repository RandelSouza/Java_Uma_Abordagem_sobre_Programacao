import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Exercicio1{
    private int codigo;
    private String nome;
    private String esporte;
    private double valorPatrocinio;

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setEsporte(String esporte){
        this.esporte = esporte;
    }

    public String getEsporte(){
        return this.esporte;
    }

    public void setValorPatrocinio(double valorPatrocinio){
        this.valorPatrocinio = valorPatrocinio;
    }

    public double getValorPatrocinio(){
        return this.valorPatrocinio;
    }

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

    public double atualizarValor(double taxa){
        this.valorPatrocinio = this.valorPatrocinio + (this.valorPatrocinio * taxa / 100);
        return this.valorPatrocinio;
    }

    public void mostrar(){
        JOptionPane.showMessageDialog(null, this.toString());
    }
}
