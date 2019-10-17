import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Conjuntos{
    public static void main(String[] args) {
        Set conjunto = new HashSet();

        conjunto.add(88);
        conjunto.add("Sobrenome e Nome");
        conjunto.add(3003.32);
        conjunto.add(99);

        System.out.println("Conteúdo do conjunto: " + conjunto);

        if(conjunto.contains(88)){
            System.out.println("O Conjunto contem o inteiro 88");
        }

        System.out.println("Removendo o inteiro 88");
        conjunto.remove(88);

        if(conjunto.contains(88)){
            System.out.println("O Conjunto ainda contem o inteiro 88");
        }else{
            System.out.println("Não contem mais o inteiro 88");
        }

        System.out.println("Criando o objeto interagir do tipo iterator...");
        Iterator interagir = conjunto.iterator();

        while(interagir.hasNext()){
            System.out.println(interagir.next());
        }
    }
}
