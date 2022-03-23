package ahorcado;

import java.util.Arrays;
import java.util.Scanner;

public class Testahorcado {

	public static void main(String[] args) {
		ahorcado miJuego = new ahorcado();
		System.out.println(miJuego);
		
		
		Scanner sc = new Scanner (System.in);
		int opcion=0;
		boolean resuelto = false;
		do {
			System.out.println("1. Intentar letra");
			System.out.println("2. Resolver");
			
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {
			case 1: {
				//Leer una letra
				String letra =sc.nextLine();
				miJuego.intentar(letra.charAt(0));
				System.out.println("Tu palabra" +Arrays.toString(miJuego.getPalabraIntentada()));
				System.out.println("Fallos:"+ miJuego.getFallos());
				
				//Comrpobar si esta solucionado
				if (miJuego.solucion()) {
					System.out.println("Has ganado, enhorabuena!!");
					resuelto = true;
				}
				
				break;
			}
			case 2: {
				break;
			}
			
			default:
				System.out.println("Opcion incorrecta, prueba otra vez");
			}
			
		}while (!resuelto && miJuego.getFallos()<6); 
	}

}
