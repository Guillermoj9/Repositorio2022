package Arrays;

import java.util.Scanner;

public class Ejercicio7 {

	public static void pintarVector(int numeros[]) {
		System.out.print("[");
		for (int i=0; i<numeros.length; i++)
			System.out.print(numeros[i]+",");
		
		System.out.println("]");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = new int [10];
		
		for (int i=0; i<8; i++) {
			numeros[i]= (int) (Math.random()*100+1);
		}
		
		
		pintarVector(numeros);
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca una posicion entre el 0 y 7");
		
		//Introduce la posicion donde vamos a meter un nuevo valor.
		int posicion=0;
		try {
			posicion= Integer.parseInt(sc.nextLine());
		}catch (Exception e) { 
			System.out.println(e.getMessage());
		}
		
		while (posicion<0 || posicion >7);
		
		//Pide por teclado el valor a introducir en esa posicion
	 
		int numero=0;
		try {
			numero= Integer.parseInt(sc.nextLine());
		}catch (Exception e) { 
			System.out.println(e.getMessage());
		}
		
		
		
		//Mover todos los elementos desde posicion hasta tamaño-1 a la derecha
		//Me voy al final, e intercambio lo que hay en la posicion i, lo pongo en i+1 
		for (int i=8; i>=posicion; i--) {
			numeros[i+1]= numeros[i];
		}
		pintarVector(numeros);
		
		//Insertar el numero en la posicion seleccionada
		
		numeros[posicion]=numero;
		
		pintarVector(numeros);
		
		
		
	}
}
