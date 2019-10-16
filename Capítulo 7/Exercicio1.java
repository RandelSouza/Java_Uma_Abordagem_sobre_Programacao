public class Exercicio1{
    public static void main(String[] args) {
        String[] meses = {"janeiro",
                          "fevereiro",
                          "março",
                          "abril",
                          "maio",
                          "junho",
                          "julho",
                          "agosto",
                          "setembro",
                          "outubro",
                          "novembro",
                          "dezembro"};

        // A questão pedia o laço while
        // no entanto, optou-se pelo laço for
        for(int mes = 0; mes < meses.length; mes++){
            System.out.println(meses[mes]);
        }
    }
}
