# Exercícios Práticos

- \[x] 1. Como fazemos para abortar um programa que está em loop infinito no prompt
   do interpretador de comandos de seu sistema Operacional.
   Pressionando a tecla <CTRl+C>.

- \[x] 2. O que significa decremento de variável? Qual o sinal que indica o decremento?
   Dê exemplos de como seria utilizado em um programa.
   Decremento de uma variável é diminuir o valor dela.
   O sinal que indica o decremento é o --.
   Exemplo do decremento:

```java
   // Classe decremento
   public class Decremento{
       public static void main( String[] args ){
           int i = 10:

           while(i >= 0){
               System.out.println("Valor decrementado: " + i);
               i--;
               // Ou ainda poderia ser escrito
               // i = i - 1
           }
       }
   }
```

- \[x] 3. Partindo do código-fonte do último exemplo, podemos afirmar que se a instrução
   for fosse alterada para a seguinte:
```java
   for (int i = 0; i < 10; i++) {...}
```
   ou para essa:
```java
   for (int i = 1; i <= 10; i++) {...}
```
   O resultado na tela seria o mesmo dos três exemplos deste capítulo.

   a) Essa declaração está correta?
      A declaração é falsa, pois o resultado seria diferente dos três exemplos, abordados no capítulo
      que no caso são: while, do while e for.

   b) O laço for seria repetido dez vezes do mesmo jeito? Faça as classes
      com alterações e explique se sim ou não e o porquê.
      Seria repetido dez veze em ambos os casos, no entanto o primeiro for listaria os números de 0 a 9.
      Enquanto o segundo for listaria os números de 1 a 10.
