public class Produto{
    private int codigo;
    private String descricao;
    private double preco;

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
}
