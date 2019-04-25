public class ExercicioResolvido2{
    public static void main( String[] args ){
        int contador = 0;
        int soma  = 0;
        int media = 0;

        do{
            contador++;
            soma = soma + contador;
            System.out.print("Laço: " + contador);
            System.out.println("   Soma: " + soma);

        } while(contador < 10);
    }
}
