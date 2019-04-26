public class ExemploDecisao{
    public static void main(String[] args) {
        String nome = "João";
         int idade = 18; // Supondo que o usuário digite 18.
        // int idade = 9; // Exercício 1 a)
        // int idade = 10; // Exercício 1 b)
        // int idade = 20; // Exercício 1 c)
        // int idade = 21; // Exercício 1 d)
        if(idade < 10){
            System.out.println(nome + " é menor e criança.");

        }
        else if(idade < 18){
            System.out.println(nome + " é menor e adolescente.");

        }
        else if(idade < 21){
            System.out.println(nome + " é maior e jovem adulto.");

        }
        else{
            System.out.println(nome + " é maior e adulto.");
        }
    }
}
