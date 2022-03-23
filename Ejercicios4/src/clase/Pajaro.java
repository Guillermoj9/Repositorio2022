package clase;

public class Pajaro {

	private int edad;
	private char color; 
	
	public void setEdad (int e) {
		edad=e;
	}
	public void printEdad( ) {
		System.out.println(edad);
	}
	public void setColor (char c) {
		color = c;
	}
	public void printCOLOR ( ) {
		
		switch (color) {
		case 'v' : System.out.println("Verde");break;
		case 'a' : System.out.println("Amarillo");break;
		case 'g' : System.out.println("Gris");break;
		case 'n' : System.out.println("Negro");break;
		case 'b' : System.out.println("Blanco");break;
		default : System.out.println("Color no establecido");
		}
	}
}

