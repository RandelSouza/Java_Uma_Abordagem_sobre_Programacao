public class TesteCompras{
    public static void main(String[] args) {
        Produto2 filme1 = new Filme();
        Produto2 livro1 = new Livro();

        CarrinhoCompras meuCarrinho = new CarrinhoCompras();

        meuCarrinho.adicionarProd(filme1);
        meuCarrinho.adicionarProd(livro1);
    }
}
