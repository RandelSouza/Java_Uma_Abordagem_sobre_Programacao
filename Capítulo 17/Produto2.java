import javax.swing.JOptionPane;

public class Produto2{
    private int codigo;
    private String descricao;
    private double preco;
    private double frete;

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setFrete(double frete){
        this.frete = frete;
    }

    public double getFrete(){
        return this.frete;
    }

    public void calcularFrete(int km){
        this.frete = km * 1.5;
    }
}
