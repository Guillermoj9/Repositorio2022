package EjercicioClase;

public class Ejercicio4String {

	public static void main(String[] args) {
		// Elimina todos los espacio en blanco de una cadena
		
		String cadena= "   Hay    muchos    espacios   en esta     cadena";
		
		cadena= cadena.trim(); // Quita los espacio en blanco del principio y el final.
		System.out.println(cadena);
		
		//Recorremos la cadena pasandola a otro resultado
		//Si encuentra espacio en blanco no los pasa a la cadena resultado.
		
		String resultado = "";
		for (int i=0; i<cadena.length(); i++) {
			if (cadena.charAt(i) != ' ') {
				resultado+= cadena.charAt(i);
			}
		}
		System.out.println(resultado);
	}

}
