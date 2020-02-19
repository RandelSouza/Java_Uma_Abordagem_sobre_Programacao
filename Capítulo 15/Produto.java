public class Produto{
    private int codigo;
    private String descricao;
    private double preco;
    private double frete;
    private DataFabricacao dtFabr;

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

    public void setDtFabr(DataFabricacao dtFabr){
        this.dtFabr = dtFabr;
    }

    public DataFabricacao getDtFabr(){
        return this.dtFabr;
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
                System.out.println("Região para Entrega: Interior.");
                this.frete = 100;
            break;

            case 'M' :
                System.out.println("Região para Entrega: Metropolitana.");
                this.frete = 0;
            break;

            case 'L' :
                System.out.println("Região para Entrega: Litoral.");
                this.frete = 20;
            break;

            default :
                System.out.println("Por favor informe: (I)nterior, (M)etropolitana, (L)itorial.");
            break;
        }
    }

}
