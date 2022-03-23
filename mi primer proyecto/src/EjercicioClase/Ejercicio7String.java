package EjercicioClase;

public class Ejercicio7String {
	
	public static String encriptar(String mensaje, int clave) {
		String resultado="";
		for (int i=0; i<mensaje.length(); i++) {
			char c = (char) (mensaje.charAt(i)+ clave);
			resultado+= c; 
		}
		
		
		return resultado; 
	}
	
	public static String desencriptar(String mensaje, int clave) {
		String resultado="";
		for (int i=0; i<mensaje.length(); i++) {
			char c = (char) (mensaje.charAt(i) - clave);
			resultado+= c; 
		}
		
		
		return resultado; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mensaje = "A ver c�mo me levanto el d�a que ponga vuestro examen";
		int clave=7;
		
		System.out.println(encriptar(mensaje,clave));
		System.out.println(desencriptar( encriptar(mensaje,clave), clave));
	}

}
