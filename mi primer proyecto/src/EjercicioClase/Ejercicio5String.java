package EjercicioClase;

public class Ejercicio5String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = " Esto es una cadena x"; 
		
		if (cadena.length()%2 ==0) { //longitud par
			System.out.println( cadena.substring(0, cadena.length() / 2) );		
		}else {
			System.out.println( cadena.substring(0, cadena.length() /2+1) );		
		}
	}

}
