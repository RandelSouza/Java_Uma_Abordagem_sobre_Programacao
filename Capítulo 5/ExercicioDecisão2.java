public class ExemploDecisao4{
    public static void main(String[] args) {
        // Conceito I (Irreguar) notas 0, 1 e 2;
        // Conceito R (Regular)  notas 3, 4 e 5;
        // Conceito B (Bom) notas 6, 7 e 8;
        // Conceito MB (Muito Bom) notas 9 e 10.

        int nota = 9;
        char conceito = '';

        if ( nota >= 9){
            conceito = 'MB';
        }
        else if (nota >= 6){
            conceito = 'B';
        }
        else if (nota >= 3){
            conceito = 'R';
        }
        else{
            conceito = 'I';
        }

        System.out.println("O conceito foi: " + conceito);
    }
}
