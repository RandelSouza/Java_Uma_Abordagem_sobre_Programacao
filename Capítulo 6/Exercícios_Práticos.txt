1. Crie uma classe que receba um nome de usuário e senha para permitir
   a troca de senhas. A nova senha tem de ser confirmada, ou seja, digitada duas vezes.
   Se essa nova senha coincidir em ambas as vezes, então exibir a mensagem: "Senha alterada com sucesso!",
   senão exibir: "Nova senha não confirmada.".

2. Desenvolva uma classe que pergunte ao usuário qual é a cotação para o dia de hoje.
   Em seguida, coverta o valor de 100 dólares em reais e exiba o resultado.

3. Crie uma classe que pergunte ao usuário qual o seu primeiro nome e depois seu
   seu sobrenome (armazene em variáveis separadas). Então solicite a digitação do
   endereço na forma de logradouro (rua, avenida, alameda, etc) e número (este último do tipo inteiro).
   Exibir os dados da seguinte forma: Sobrenome, Nome, Logradouro, número.


4. Criar uma classe que exiba um menu de Agendamento de Consultas Médicas com as opções:
    * Inserir novo paciente (apenas exibir a mensagem "Inserindo novo paciente.").
    * Inserir novo médico (apenas exibir a mensagem "Inserindo novo médico.").
    * Marcar consulta (exibir "Marcando consulta.").
    * Descarmar consulta (exibit "Desmarcando consulta.").
    * Digite 0 para sair.

    Só permitir ao usuário sair do programa quando ele digitar zero (0) e, enquanto isso
    não acontecer, ficar repetindo o menu.

5. Utilizando JOptionPane.show, peça para o usuário digitar um número inteiro e verifique se ele é par
   ou ímpar, exibindo uma mensagem com a resposta. Para calcular o resto de uma divisão de inteiros utiliza-se a instrução %,
   por exemplo: if (num % 2 == 0){...}

6. Crie uma classe que calcule a paridade do número (como no exercício anterior) dentro de um laço do...while e repita
   essa operação até que seja digitado o número zero.

7. Agora usando o laço while repita o teste de paridade até que o usuário digite zero,
   mas no momento em que o zero for digitado, o programa tem que encerrar e não calcular mais ele é par ou ímpar.

8. Crie um método chamado paridade(int num) que recebe como argumento o número digitado em um JOptionPane.showInputDialog()
   e já exiba a mensagem dizendo se é par ou ímpar. Como no exercício anterior, repita a digitação e cálculo até que se digite zero.

9. Como no exercício anterior, crie um método paridade que além de receber um argumento inteiro também retorne uma String com o resultado do cálculo,
   porém que essa mensagem seja exibida por um JOptionPane() já no método main.

10. Mais uma vez faça o teste de paridade dentro de um método de mesmo nome, porém
    desta vez que ele retorne um valor lógico (boolean) que seja True, se o argumento for par, e false, se o tal número for ímpar.
    Voltando para o método main, faça uma instrução if ara testar se a resposta é verdadeira ou falsa exibindo assim a mensagem correspondente.
