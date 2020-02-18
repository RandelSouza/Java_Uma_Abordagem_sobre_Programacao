# Exercícios Práticos

- \[x] 1. Pesquise para entender melhor:
  a) Sabendo que a parte física é o Hardware e que a parte lógica é o Software, dê exemplos para cada uma dessas partes.
    Parte física (Hardware): mouse, teclado, impressora, CPU, estabilizador e monitor.
    Parte lógica (Software): Sistema Operacional, gerenciador de discos, programas de usuário e qualquer programa que seja executavel no computador.

  b) Não se esqueça de incluir aí o Peopleware (que somos nós pessoas), pois não existe apenas o usuário final, mas também
     vários profissionais envolvidos na computação. Você se considera um deles? Explique.
     Sim, pois estamos em contado constante com Sistemas da Informação e com a Tecnologia da Informação e Comunicação e trabalhamos seja direta
     ou seja indireramente com eles.

- \[x] 2. Crie uma tabela com a faixa de valores possíveis para os tipos byte, short, int e long.

|   TIPO   |   DESCRIÇÃO   |
|----------|:-------------:|
|   byte   |  Inteiro de 8 bits em notação de  complemento de dois. Pode assumir valores entre -2⁷ = -128 e 2⁷-1=127
|----------|:-------------:|
|  short   |    centered   |
|----------|:-------------:|
|   int    | right-aligned |
|----------|:-------------:|
|  long    | right-aligned |




    +---------------------+-------------------------------------+
    |        TIPO         |              DESCRIÇÃO              |
    +---------------------+-------------------------------------+
    |                     | Inteiro de 8 bits em notação de     |
    |        byte         | complemento de dois. Pode assumir   |
    |                     | valores entre -2⁷ = -128 e 2⁷-1=127.|
    +---------------------+-------------------------------------+
    |                     | Inteiro de 16 bits em notação de    |
    |                     | complemento de dois. Os valores     |
    |        short        | possívels cobrem a faixa de         |
    |                     | -2^-15=-32.768 a 2^15-1=32.767      |
    +---------------------+-------------------------------------+
    |                     | Inteiro de 32 bits em notação de    |
    |                     | complemento de dois. Pode assumir   |
    |         int         | valores entre -2^31=2.147.483.648   |
    |                     | e 2^31-1=2.147.483.647.             |
    +---------------------+-------------------------------------+
    |                     | Inteiro de 64 bits em notação de    |
    |         long        | complemento de dois. Pode assumir   |
    |                     | valores entre -263 e 263-1.         |
    +---------------------+-------------------------------------+

3. O que signifiva Casting em programação.
  Na linguagem Java, é possível se atribuir o valor de um tipo de variável
  a outro tipo de variável, porém para tal é necessário que esta operação
  seja apontada ao compilador. A este apontamento damos o nome de casting.

  Por exemplo ao fazer casting de uma variável float para uma variavel int,
  estamos atribuindo o valor que está contido na variavel float para dentro da
  variavel int, no entando o valor a ser depositado é o valor transformado que seja aceito pela variavel
  int, conforme sua estrutura de tipo primitivo aceita.

4. Vamos estender nosso conhecimento para os números reais, respondendo quantos bytes ocupam na memória os tipos float e double.
  O tipo float ocupa 4 bytes e o tipo double ocupa 8 bytes.
