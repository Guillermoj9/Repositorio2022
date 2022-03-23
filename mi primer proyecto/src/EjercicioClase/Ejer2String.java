package EjercicioClase;

public class Ejer2String {

	public static void main(String[] args) {

		String cadena =  "https://www.iesjaroso.es/noticias";
		
		System.out.println(cadena.substring(0, "http".length()));
		System.out.println(cadena.substring(8, "www.iesjaroso.es".length()));
		
	}

}
