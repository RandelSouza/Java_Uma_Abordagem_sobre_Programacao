public class ExemploDecisao4{
    public static void main(String[] args) {
        char letra = 'x';

        switch(letra) {
            case 'c':
                System.out.println("letra c.");
                break;

            case 'p':
                System.out.println("letra p.");
                break;

            case 'u':
                System.out.println("letra u.");
                break;
            default:
                System.out.println("Não foram encontradas 'c', 'p' e e nem 'u'.");
                break;
        }
    }
}
