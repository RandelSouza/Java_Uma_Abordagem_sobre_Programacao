public class ExemploDecisao2{
    public static void main(String[] args) {
        String nome = "João";
        int idade = 18; // Supondo que o usuário digite 18.

        if(idade < 10){
            System.out.println(nome + " é menor e criança.");

        }
        if(idade < 18){
            System.out.println(nome + " é menor e adolescente.");

        }
        if(idade < 21){
            System.out.println(nome + " é maior e jovem adulto.");

        }
        else{
            System.out.println(nome + " é maior e adulto.");
        }
    }
}
