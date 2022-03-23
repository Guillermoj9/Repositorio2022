package Arrays;

public class PruebasString {

	public static void main(String[] args) {
		
		String mensaje= "Hola mundo";
		//Longitud de una cadena
		System.out.println("Longitud de la cadena"+ mensaje.length());
		//Caracter en una posicion de la cadena
		System.out.println("Caracter en la posicion 2 "+ mensaje.charAt(3));
		//Encontrar psocicion de una subcadena en una cadena 
		System.out.println("Posicion de la subcadena 'mu'"+ mensaje.indexOf("mu"));
		
		
		//Saber si una subcadena está dentro de una cadena.
		String c1= "En un lugar de la Mancha de cuyo nombre no quiero . . . ";
		String sub= "mancha";
		
		//Buscar numero de caracter
		System.out.println(c1.indexOf(sub));
		if (c1.indexOf(sub)>= 0) {
			System.out.println("Si esta");
		} else {
			//indexOF devuelve un número negativo.
			System.out.println("No esta");
		}
		//Comprobar si una subcadena está dentro de una cadena, obviando mayúsculas
		System.out.println(c1.indexOf(sub));
		if ((c1.toLowerCase().indexOf(sub)>= 0)) {
			System.out.println("Si esta");
		} else {
			//indexOF devuelve un número negativo.
			System.out.println("No esta");
		}
		
		
		//Unir dos cadenas
		String nombre="Guille";
		String apellidos="Jabalera Pérez";
		String nombreAPintar= nombre.concat("  ").concat(apellidos);
		System.out.println(nombreAPintar); //ESTO PINTA LO DE ARRIBA
		System.out.println(nombre+ "   " + apellidos); //PINTA NOMBRE+APELLIDOS
		
		//Subcadena de una cadena
		String mensaje2= "Me gusta mucho Java, cada vez más";
		//Sacar Java
		System.out.println(mensaje2.substring(15,19));
		System.out.println(mensaje2.substring(mensaje2.indexOf("Java"),
				mensaje2.indexOf("Java")+ "Java".length()));//Substring (15,15+4)
		
		
		//Quitar espacios
		String mensaje3= "     Hola";
		System.out.println(mensaje3);
		System.out.println(mensaje3.trim());
		
	
		
		
		
		
		
	}

}
