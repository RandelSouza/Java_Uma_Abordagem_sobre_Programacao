public class Exemplo2 {

    // Método público que realiza a soma
    public static int somar( int numero1, int numero2 ){
        return numero1 + numero2;
    }

    // Método público que realiza a subtração
    public static  int subtrair( int numero1, int numero2 ){
        return numero1 - numero2;
    }
    
    // Método principal onde se executa a aplicação
    public static void main( String[] args ){
        int numero1 = 10;
        int numero2 = 5;

        // Chamada do método somar e respectiva atribuição do retorno à variável resultadoSoma
        int resultadoSoma = somar( numero1, numero2 );

        // Chamada do método subtrair e respectiva atribuição do retorno à variável resultadoSubtração
        int resultadoSubtração = subtrair( numero1, numero2 );

        System.out.println( "Resultados: " );
        System.out.println( "Soma " + resultadoSoma );
        System.out.println( "Subtração " + resultadoSubtração );
    }

}
