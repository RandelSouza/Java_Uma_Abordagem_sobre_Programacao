public class Exemplo1 {

    public static void escreverBoasVindas(){
      System.out.println("Olá Pessoal");
      System.out.println("Bem Vindos ao Curso de Java...");
    }

    public static void listarChamada(){
      System.out.println("Estão presentes os cursistas:");
      System.out.println("João\nMaria\nPedro\nGilberto\nIsabela");
    }

    public static void main( String[] args ){
      escreverBoasVindas();
      int i = 10;
      listarChamada();
      // Se chegarem mais alunos, serão novamente saudados.
      escreverBoasVindas();
      // Um método pode ser chamdado quantas vezes forem necessárias.
    }

}
