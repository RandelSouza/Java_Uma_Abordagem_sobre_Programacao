import javax.swing.JOptionPane;

public class Produto{
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

    public void calcularFrete(char regiao){
        switch (regiao){
            case 'I' :
                JOptionPane.showMessageDialog(null, "Região para Entrega: Interior.");
                this.frete = 100;
            break;

            case 'M' :
                JOptionPane.showMessageDialog(null, "Região para Entrega: Metropolitana.");
                this.frete = 0;
            break;

            case 'L' :
                JOptionPane.showMessageDialog(null, "Região para Entrega: Litoral.");
                this.frete = 20;
            break;

            default :
                JOptionPane.showMessageDialog(null, "Por favor informe: (I)nterior, (M)etropolitana, (L)itorial.");
            break;
        }
    }

    public void exibirDados(){
        JOptionPane.showMessageDialog(null, "Código: " + this.codigo + "\n" +
                                            "Descrição: " + this.descricao + "\n" +
                                            "Preço: " + this.preco + "\n" +
                                            "Frete: " + this.frete + "\n"

        );
    }
}
