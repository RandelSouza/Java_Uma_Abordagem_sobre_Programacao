public class ExemploRepeticao3{
	public static void main( String[] args ){
		// Primeiro declaramos a variável auxiliar
		int auxiliar = 0;
		for( auxiliar <= 100000; auxiliar++ ){
			System.out.println( auxiliar );
			auxiliar = auxiliar + 1;
		}
	}
}
