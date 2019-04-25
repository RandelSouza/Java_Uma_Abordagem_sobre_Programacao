/*
No exemplo a seguir, deve-se criar uma classe que some os 10 números consecutivos,
de 1 a 10, e exiba a cada interação o número de repetição (laço) e a soma acumulada
até então. No fim, deve-se exibir a soma de todos e também a média entre eles.
veja o passo a passo a seguir:

1. Declare a classe ExercicioResolvido1 como pública, e inicie com o método main()
2. Declare uma variável contador para contar de 1 a 10;
3. Declare uma variável soma para acumular o resultado da soma de cada número
seguinte, a cada vez que for executado o laço while;
4. Declare a variável media para calcular a média; note que na variável não há
acento algum (não utilizar também os caracteres especiais como !,@,#...). O
tipo dela pode ser inteiro, pois na divisão de dois inteiros (soma/contador)
o resultado é apresentado inteiro.
*/
public class ExercicioResolvido1{
    public static void main( String[] args ){
        int contador = 0;
        int soma  = 0;
        int media = 0;

        while(contador <= 10){
            contador++;
            soma = soma + contador;
            System.out.print("Laço: " + contador);
            System.out.println("   Soma: " + soma);

        }

        System.out.println("Soma dos 10 Primeiros Números: " + soma);
        System.out.println("Média dos 10 Primeiros Números: " + soma/contador);
    }
}
