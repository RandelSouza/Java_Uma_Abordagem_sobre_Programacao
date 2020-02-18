1. Dada a seguinte classe Produto:

```java
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
```

Crie uma classe filha de produto chamada Livro e crie um método public void exibirDados() para
mostrar o código, a descricao e o preço desse objeto do tipo livro.]

___
`Observação: Lembre-se de que na classe Livro não há visibilidade de-
reta dos atributos que o método tem de mostrar, pois eles são private
na classe mãe. Então utilize o recurso de encapsulamento (get e set).`
___


2. Crie uma classe TestaProduto que faça a instanciação de um objeto do tipo Livro, peça ao usuário
   final digitar os valores dos atributos dele com os respectivos tipos de dados e utilize o método
   exibirDados() para mostrá-los.
