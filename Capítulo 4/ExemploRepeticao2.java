public class ExemploRepeticao2{
	public static void main( String[] args ){
		// Primeiro declaramos a variável auxiliar
		int auxiliar = 0;
		do{
			System.out.println( auxiliar );
			auxiliar = auxiliar + 1;
		} while( auxiliar <= 100000 );
	}
}
