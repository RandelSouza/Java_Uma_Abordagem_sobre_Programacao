# Exercícios Práticos

- \[ ] 1. Elabore uma classe de testes chamada **TesteProduto1** (com um método **main()**), a qual
          solicite ao usuário digitar a descrição do objeto do tipo **Produto** e a distância em
          quilômetros para a entrega. Então calcule o preço do frete e exiba-o juntamente com o nome do
          produto.

- \[ ] 2. Faça uma nova classe de testes com o nome de TesteProduto2, na qual o usuário final digitará,
          além da descrição do produto, a região em que se encontra para cálculo do frete da entrega.
          Exibir ao final as duas informações: Descrição do Produto e Preço do frete.

- \[ ] 3. Crie uma classe para a venda de canetas que seja filha de **Produto2.java**.

- \[ ] 4. Refaça a classe **TesteCompras.java** instanciando dois produtos do tipo caneta,
          populando seus atributos com valores que desejar e, em seguida, adicione-os ao carrinho de compras. Ao instanciar o objeto, pode-se escrever das duas formas.

```java
Produto caneta1 = new Caneta();
Caneta caneta1 = new Caneta();
```

Isso é possível, pois, caneta é um produto, e o produto pode ser uma caneta.          


- \[ ] 5. Altere a classe **TesteCompras** e dessa vez criar um laço **for** tradicional para percorrer
          a lista e exibir os dados. Salvá-la com o nome de **CopiaDeTesteCompras.java**.

- \[ ] 6. Descreva o que aconteceria se, em vez de usar laços de repetição para percorrer a lista, fosse escrito apenas:

```java
System.out.println(minhaLista);
```

veja o exemplo:

```java
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CopiaDeTesteCompras{
    public static void main(String[] args){
        Livro livro = new Livro();
        Produto filme = new Filme();
        Produto caderno = new Caderno();

        livro.inserirDados();
        filme.inserirDados();
        caderno.inserirDados();        

        CarrinhoCompras meuCarrinho = new CarrinhoCompras();

        meuCarrinho.adicionar(livro);
        meuCarrinho.adicionar(filme);
        meuCarrinho.adicionar(caderno);

        List<Produto> minhaLista = meuCarrinho.gerarLista();
        double totalFrete = 0.0;
        int km = Integer.parseInt(JOptionPane.showInputDialog("Distância em kilometros para a entrega?"));

/*
        for(int i=0; i < minhaLista.size(); i++){
            totalFrete += minhaLista.get(i).calcularFrete(km);
            System.out.println(minhaLista.get(i));
        }
        System.out.println("Total do frete: " + totalFrete);
*/        
        System.out.println(minhaLista);
    }
}
```
___

**Observação:** Note que o laço **for** e o cálculo do frete se tornaram comentários, ou seja, parte
de código-fonte que não será executada. Logo abaixo desse código-fonte comentado está a instrução que mostra todo o contéudo da lista.
___

- \[ ] 7. Criar a classe **Ciclista.java** sobrescrevendo o método **atualizarValor(double taxa)**, porém, diferente de **Corredor**, que dobra a taxa, desta vez apenas adicione R$ 37,00 a mais do que o valor da superclasse.

- \[ ] 8. Faça a classe **TesteSimples.java** criando o objeto ciclista baseado no exercício anterior:

     **a)** Inserir dados;<br>
     **b)** Atualizar o valor do patrocínio;<br>
     **c)** Mostrar os resultados.<br>

- \[ ] 9. Crie dentro do método **main()** de uma classe um vetor de Strings de 3 posições. Em seguida, solicite ao usuário digitar um nome de um mês para cada posição (utilizando um laço **for**). Então crie um **ArrayList()** chamado **listaTri** e adicione os três meses do vetor um por um à lista. Pode ser feito, por exemplo, por um laço **while**. Por fim exibir o contéudo de **listaTri**.
